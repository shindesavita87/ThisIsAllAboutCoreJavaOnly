package org.example.javacollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysOfIteratingCollElements {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Hey" ,","," Savita"," How"," are"," you", " dear","...");
        System.out.println(list.size());

        System.out.println("1_With typical i loop=>");
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }

        System.out.println("\n2_With old for each loop=>");
        for (String ele:list) {
            System.out.print(ele);
        }

        System.out.println("\n3_With basic loop using Iterator=>");
        for(Iterator iterator=list.iterator();iterator.hasNext();)
        {
            System.out.print(iterator.next());
        }

        System.out.println("\n4_Iterator with while loop=>");
        Iterator<String> it=list.listIterator();
        while (it.hasNext())
        {
            System.out.print(it.next());
        }

        System.out.println("\nJava 8 stream + lambda example=>");
        list.stream().forEach(ele1 -> System.out.print(ele1));

        System.out.println("\nJava 8 using forEach and lambda=>");
        list.forEach((ele2)-> System.out.print(ele2));


    }
}
