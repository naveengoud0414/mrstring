package io.deeti.mrstring.assertion;

public class Assert {

    public static <T> void notNull(T src) {
        if(src == null) {
            throw new IllegalArgumentException("source must not null");
        }
    }

    public static <T> void notNulls(T arg0, T arg1) {
        if (arg0 == null && arg1 == null) {
            throw new IllegalArgumentException("sources must not null");
        }
    }
}
