package com.stackroute.practice5;

//5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//        Modify and return the given map as follows:
//        a. If the key `val1` has a value, set the key `val2` to have that value, and
//        b. Set the key `val1` to have the value `" "` (empty string).
//        Example 1:
//        The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
//        "java"}
//        Example 2:
//        The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
//        "mars"}

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSwap {

    static Map<String,String> swapValue(Map<String,String> userMap){

        Set setOfAllKeys = userMap.keySet();                              // Extracting only all the key
        Object[] keyObjects = new Object[setOfAllKeys.size()];

        Iterator iterator = setOfAllKeys.iterator();
        int i = 0;

        while(iterator.hasNext()){
            keyObjects[i] = iterator.next();                             //Storing all the key in an object array
            i++;
        }

        Object newValue = userMap.get(keyObjects[1]);                    //Storing first key value in an object
        userMap.put(keyObjects[1].toString()," ");
        userMap.put(keyObjects[0].toString(), String.valueOf(newValue)); //replacing value of key2 with value of key1

        return userMap;
    }
}
