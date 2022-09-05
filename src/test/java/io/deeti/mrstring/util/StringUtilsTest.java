package io.deeti.mrstring.util;

import io.deeti.mrstring.util.StringUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void toArray() {
        String src = "Yo,Ho,Ho,Ho,Ho";
        String[] strings = StringUtils.toArray(src, ",");

        String[] split = src.split(",");

        Assertions.assertThat(strings)
                .containsSequence(split);
    }

    @Test
    void join() {

        String[] s = {"A", "B", "C", "D", "E", "F", "G"};
        String excepting = "A_B_C_D_E_F_G";
        String actual = StringUtils.join("_", s);

        Assertions.assertThat(actual)
                .isEqualTo(excepting);

    }
}