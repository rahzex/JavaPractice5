package com.stackroute.practice5;

//3. Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

import java.util.HashMap;
import java.util.Map;

public class MapStringBool {
    static Map<String,Boolean> countChar(String[] userInput){
        Map<String,Boolean> map = new HashMap<>();
        int countA = 0, countB = 0, countC = 0, countD = 0;
        for (int i=0; i<userInput.length; i++){

            if (userInput[i].contains("a"))
                countA++;

            else if (userInput[i].contains("b"))
                countB++;

            else if (userInput[i].contains("c"))
                countC++;

            else if (userInput[i].contains("d"))
                countD++;
        }

        if (countA >= 2)
            map.put("a",true);
        else
            map.put("a",false);

        if (countB >= 2)
            map.put("b",true);
        else
            map.put("b",false);

        if (countC >= 2)
            map.put("c",true);
        else
            map.put("c",false);

        if (countD >= 2)
            map.put("d",true);
        else
            map.put("d",false);

        return map;
    }
}
