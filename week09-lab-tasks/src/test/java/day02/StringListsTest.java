package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {
    @Test
    void testStringLists(){
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(Arrays.asList("aa", "bb", "dd"), new StringLists().shortestWords(words));
    }

    @Test
    void testStringLists2(){
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(Arrays.asList("aa", "bb", "dd"), new StringLists().shortestWords2(words));
    }
}
