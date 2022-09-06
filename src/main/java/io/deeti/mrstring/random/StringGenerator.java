package io.deeti.mrstring.random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class StringGenerator {

    private StringGenerator() {
    }

    public static String generateWithDate(String s, LocalDate date) {
        String format = String.format("%d%d%d",
                date.getYear(),
                date.getMonth().getValue(),
                date.getDayOfMonth());
        return s.concat(format);
    }

    public static String generateStringInts(int noOfInts) {
        StringBuilder randomStrInts = new StringBuilder();
        for (int i = 0; i < noOfInts; i++) {
            randomStrInts.append(new Random()
                    .nextInt(noOfInts));
        }
        return randomStrInts.toString();
    }

    public static String generateTxId(String prefix, LocalDateTime dateTime, Integer id) {
        return prefix +
                dateTime.getYear() +
                dateTime.getMonthValue() +
                dateTime.getDayOfMonth() +
                dateTime.getHour() +
                dateTime.getMinute() +
                dateTime.getSecond() +
                id;
    }

    public static String generateTxId(String prefix, LocalDateTime dateTime, String id) {
        return prefix +
                dateTime.getYear() +
                dateTime.getMonthValue() +
                dateTime.getDayOfMonth() +
                dateTime.getHour() +
                dateTime.getMinute() +
                dateTime.getSecond() +
                id;
    }

    public static String generateTxId(String prefix, int bound) {
        return prefix + generateStringInts(bound);
    }
}
