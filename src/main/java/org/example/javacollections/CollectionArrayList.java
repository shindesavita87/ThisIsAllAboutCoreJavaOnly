package org.example.javacollections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
       Collection<String> col=new ArrayList<>();
       col.add("My");
       col.add("New");
       col.add("Dream");
       col.add("Home");
        System.out.println(col);

        col.remove("New");
        System.out.println(col);

        col.add("Savita's");
        System.out.println(col);

        System.out.println(col.contains("Dream"));

        System.out.println(col.equals("My"));

        System.out.println("For each loop of Java 8");
        col.forEach((curEle)->{System.out.print(curEle+ " ");
        });

    }
}
