package org.example.javacollections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("0_Value 1");
        list.add("1_Value 2");
        list.add("2_Value 2");
        list.add("3_Value 5");
        list.add("4_Value 3");
        list.add(null);
        list.add("");
        System.out.println(list.size());
        System.out.println(list.get(6));
        System.out.println(list.get(5));
        System.out.println(list.get(5));
        list.set(1,"Savi");
        list.forEach((ele)->
        {
            System.out.println(ele);
        });

        list.remove(1);
        System.out.println(list);

        System.out.println("Before removeAll");
        System.out.println(list.size());
        System.out.println(list);

        List<String> list2=new ArrayList<>();
        list2.add("");
        list2.add(null);

        list.removeAll(list2);
        System.out.println("After removeAll");
        System.out.println(list.size());
        System.out.println(list);


        list.clear();
        System.out.println(list);
    }
}
