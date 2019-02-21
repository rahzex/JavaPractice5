package com.stackroute.practice5;

//6. Write a program to implement set interface which sorts the given randomly ordered names in
//        ascending order. Convert the sorted set in to an array list

//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    //method to sort a set and convert it to an ArrayList
    static ArrayList sortSet(Set userSet){
        Set<String> result = new TreeSet<>(userSet);        //TreeSet Automatically sorts a set into ascending order
        return new ArrayList(result);
    }
}
