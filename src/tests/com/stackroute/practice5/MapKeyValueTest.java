package com.stackroute.practice5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapKeyValueTest {

    @Test
    public void countString() {
        String actual = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals(map,MapKeyValue.countString(actual));
    }
}