package io.deeti.mrstring;

import io.deeti.mrstring.util.StringUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void toArrayTest() {
        String src = "Yo,Ho,Ho,Ho,Ho";
        String[] strings = StringUtils.toArray(src, ",");

        String[] split = src.split(",");

        Assertions.assertThat(strings)
                .containsSequence(split);
    }
}