package org.example.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachWordFromGivenString {
    public static void main(String[] args) {
        String myString = "Hello, Savita you are simply brilliant savita is great and great is Savita";

        String[] wordArr = myString.toLowerCase().split(" ");

        Map<String, Integer> hashMap = new HashMap<>();

        for (String word:wordArr) {

            Integer integer = hashMap.get(word);

            if(integer==null)
            {
               hashMap.put(word,1);
            }
            else {
                hashMap.put(word,integer+1);
            }
        }
        System.out.print(hashMap);
    }
}
