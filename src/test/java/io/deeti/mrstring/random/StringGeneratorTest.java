package io.deeti.mrstring.random;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class StringGeneratorTest {

    @Test
    void generateWithDate() {
        String yoyo = StringGenerator.generateWithDate("YOYO", LocalDate.now());
        assertThat(yoyo)
                .isEqualTo("YOYO202296");
    }

    @Test
    void generateStringInts() {
        String s = StringGenerator.generateStringInts(20);
        assertThat(s)
                .isNotNull();
    }

    @Test
    void generateTxIdWithDateTimeIntId() {
        LocalDateTime now = LocalDateTime.now(Clock.systemDefaultZone());
        String expectedTxIntId = "TX" +
                now.getYear() +
                now.getMonthValue() +
                now.getDayOfMonth() +
                now.getHour() +
                now.getMinute() +
                now.getSecond() +
                279;

        String txWithIntId = StringGenerator.generateTxId("TX", now, 279);
        assertThat(txWithIntId)
                .isEqualTo(expectedTxIntId);
    }

    @Test
    void generateTxIdWithDateTimeAndStringId() {
        LocalDateTime now = LocalDateTime.now(Clock.systemDefaultZone());
        String expectedTxStrId = "TX" +
                now.getYear() +
                now.getMonthValue() +
                now.getDayOfMonth() +
                now.getHour() +
                now.getMinute() +
                now.getSecond() +
                "279";

        String txWithStrId = StringGenerator.generateTxId("TX", now, "279");
        assertThat(txWithStrId)
                .isEqualTo(expectedTxStrId);
    }

    @Test
    void generateTxIdWithRandomInts() {
        String randomTxId = StringGenerator.generateTxId("TX", 14);
        assertThat(randomTxId)
                .isNotNull();
    }
}