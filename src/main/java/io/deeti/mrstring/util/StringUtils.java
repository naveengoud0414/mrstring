package io.deeti.mrstring.util;

import io.deeti.mrstring.assertion.Assert;

import java.util.StringJoiner;

/***
 * StringUtils contains convenient static methods
 */
public class StringUtils {

    private StringUtils() {
    }

    /**
     * Extracts <code>s</code> and returns <code>String[]</code> by given <code>delim</code>
     * @param s source to be extract
     * @param delim delimiter
     * @return Returns String[] of given source
     * @throws NullPointerException if given args s or delim is null
     */
    public static String[] toArray(String s, String delim) {
        Assert.notNulls(s, delim);
        return s.split(delim);
    }

    /***
     * Joins given <code>String[]</code> and returns <code>String</code>
     * @param delim delimiter
     * @param src source
     * @return Return {@link String}
     * @throws NullPointerException if <code>delim</code> or <code>src</code> is null
     */
    public static String join(String delim, String... src) {
        Assert.notNulls(src, delim);

        StringJoiner stringJoiner = new StringJoiner(delim);
        for (String s : src) {
            stringJoiner.add(s);
        }
        return  stringJoiner.toString();
    }
}
