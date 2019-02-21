package com.stackroute.practice5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapSwapTest {

    @Test
    public void swapValue() {
        Map<String,String> actualMap = new HashMap<>();
        actualMap.put("val1","java");
        actualMap.put("val2","c++");

        Map<String,String> expectedMap = new HashMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","java");

        assertEquals(expectedMap,MapSwap.swapValue(actualMap));

        actualMap.clear();
        actualMap.put("val1","mars");
        actualMap.put("val2","saturn");

        expectedMap.clear();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","mars");

        assertEquals(expectedMap,MapSwap.swapValue(actualMap));
    }
}