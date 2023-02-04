package org.example.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfEachCharacterFromGivenString {
    public static void main(String[] args) {
        String myString = "Hello, Savita you are simply brilliant savita is great and great is Savita";

        char[] wordArr = myString.toLowerCase().toCharArray();

        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c:wordArr) {

            if(hashMap.containsKey(c))
            {
               hashMap.put(c,hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);
            }
        }
        System.out.print(hashMap);
        for (Map.Entry entry:hashMap.entrySet()) {
            System.out.println(entry.getKey() + "=>" +entry.getValue());
        }
    }
}
