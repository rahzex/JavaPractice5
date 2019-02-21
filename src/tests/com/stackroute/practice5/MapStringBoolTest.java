package com.stackroute.practice5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapStringBoolTest {

    @Test
    public void countChar() {
        String[] actual = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a",true);expected.put("b",false);
        expected.put("c",true);expected.put("d",false);

        assertEquals(expected,MapStringBool.countChar(actual));
    }
}