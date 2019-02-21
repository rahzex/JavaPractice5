package com.stackroute.practice5;

//2. Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.
//        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapKeyValue {

    static Map<String,Integer> countString(String userInput){
        Pattern one = Pattern.compile("one");
        Pattern two = Pattern.compile("two");
        Pattern three = Pattern.compile("three");

        Matcher mOne = one.matcher(userInput);
        Matcher mTwo = two.matcher(userInput);
        Matcher mThree = three.matcher(userInput);

        int countOne = 0, countTwo = 0, countThree = 0;

        while (mOne.find()) {
            countOne++;
        }
        while (mTwo.find()) {
            countTwo++;
        }
        while (mThree.find()) {
            countThree++;
        }

        Map<String,Integer> map = new HashMap<>();
        map.put("one",countOne);
        map.put("two",countTwo);
        map.put("three",countThree);

        return map;
    }
}

