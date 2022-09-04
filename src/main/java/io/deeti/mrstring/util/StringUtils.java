package io.deeti.mrstring.util;

import io.deeti.mrstring.assertion.Assert;

/***
 * StringUtils contains convenient static methods
 */
public class StringUtils {


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
}
