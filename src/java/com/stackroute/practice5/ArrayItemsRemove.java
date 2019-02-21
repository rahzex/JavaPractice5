package com.stackroute.practice5;

//1. Write a Java program to update specific array element by given element and empty the array list.
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list after removing all elements []

import java.util.ArrayList;

public class ArrayItemsRemove {

    // method to update elements
    static ArrayList<String> updateElements(ArrayList<String> list){
        list.set(0,"Kiwi");
        list.set(2,"Mango");
        return list;
    }

    //method to remove all elements
    static ArrayList<String> removeElements(ArrayList<String> list){
        list.clear();
        return list;
    }
}
