package io.deeti.mrstring.assertion;

public class Assert {

    public static <T> void notNull(T source) {
        if(source == null) {
            throw new IllegalArgumentException("source must not null");
        }
    }

    public static <T> void notNulls(T firstSource, T secondSource) {
        if (firstSource == null && secondSource == null) {
            throw new IllegalArgumentException("sources must not null");
        }
    }
}
