package io.deeti.mrstring.random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/***
 * Contains convenient <code>static</code> methods to generate <code>String</code>
 */
public class StringGenerator {

    private StringGenerator() {
    }

    /***
     * Generates <code>String</code> by combing both given <code>prefix</code> and <code>date</code>
     * @param prefix prefix
     * @param date date
     * @return Returns generated <code>String</code>
     */
    public static String generateWithDate(String prefix, LocalDate date) {
        String format = String.format("%d%d%d",
                date.getYear(),
                date.getMonth().getValue(),
                date.getDayOfMonth());
        return prefix.concat(format);
    }

    /***
     * Generates <code>String</code> ints
     * @param noOfInts noOfInts
     * @return Returns generated <code>String</code>
     */
    public static String generateStringInts(int noOfInts) {
        StringBuilder randomStrInts = new StringBuilder();
        for (int i = 0; i < noOfInts; i++) {
            randomStrInts.append(new Random()
                    .nextInt(noOfInts));
        }
        return randomStrInts.toString();
    }

    /***
     * Generates TxId based on given <code>prefix</code>, <code>dateTime</code> and <code>id</code>
     * @param prefix prefix
     * @param dateTime dateTime
     * @param id id
     * @return Returns generated TXId
     */
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

    /***
     * Generates TxId based on given <code>prefix</code>, <code>dateTime</code> and <code>id</code>
     * @param prefix prefix
     * @param dateTime dateTime
     * @param id id
     * @return Returns generated TXId
     */
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

    /***
     * Generates TXId based on given <code>prefix</code> and <code>bound</code>
     * @param prefix prefix
     * @param bound bound is no of int values to be added to prefix
     * @return Returns generated TxId
     */
    public static String generateTxId(String prefix, int bound) {
        return prefix + generateStringInts(bound);
    }
}
