package com.stackroute.practice5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayItemsRemoveTest {

    ArrayList<String> actual = new ArrayList<>();

    @Test
    public void updateElements() {
        actual.add("Apple");actual.add("Grape");actual.add("Melon");actual.add("Berry");
        ArrayList<String> expected = actual;
        expected.set(0,"Kiwi");
        expected.set(2,"Mango");
        assertEquals(expected,ArrayItemsRemove.updateElements(actual));
    }

    @Test
    public void removeElements() {
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected,ArrayItemsRemove.removeElements(actual));
    }
}