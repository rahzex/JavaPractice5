package com.stackroute.practice5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortSetTest {

    @Test
    public void sortSet() {
        Set<String> actualvalue = new HashSet<>();
        actualvalue.add("Harry");
        actualvalue.add("Olive");
        actualvalue.add("Alice");
        actualvalue.add("Bluto");
        actualvalue.add("Eugene");

        Set<String> expectedValue = new TreeSet<>(actualvalue);

        assertEquals(new ArrayList<>(expectedValue),SortSet.sortSet(actualvalue));
    }
}