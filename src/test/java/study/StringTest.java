package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    @DisplayName("샘플 코드 : replace()")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1 : split()")
    void split() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1", "2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2 : substring()")
    void substring() {
        String test = "(1,2)";
        String actual = test.substring(1, test.length() - 1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항 3 : 문자열 위치값 범위 벗어날 시 StringIndexOutOfBoundsException 발생")
    void charAt_assertThatThrownBy() {
        String actual = "abc";
        assertThatThrownBy(() -> {
            actual.charAt(actual.length());
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d", actual.length());
    }

    @Test
    @DisplayName("요구사항 3 : 문자열 위치값 범위 벗어날 시 StringIndexOutOfBoundsException 발생")
    void charAt_assertThatExceptionOfType() {
        String actual = "abc";
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    actual.charAt(actual.length());
                }).withMessageMatching("String index out of range: \\d+");
    }
}

