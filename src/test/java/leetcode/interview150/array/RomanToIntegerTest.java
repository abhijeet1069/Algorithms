package leetcode.interview150.array;

import leetcode.interview150.array.RomanToInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @ParameterizedTest
    @CsvSource({
            "III, 3",
            "LVIII, 58",
            "MCMXCIV, 1994"
    })
    void romanToInt(String s, int expected) {
        assertEquals(expected,new RomanToInteger().romanToInt(s));
    }
}