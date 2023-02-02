package org.example;

import java.util.Arrays;
import java.util.List;

public class IterateElementsWithDifferentWays {
    public static void main(String[] args) {
        String myString = "Hello, Savita you are simply brilliant savita is great and great is Savita";

        List<String> list= Arrays.asList(myString);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
