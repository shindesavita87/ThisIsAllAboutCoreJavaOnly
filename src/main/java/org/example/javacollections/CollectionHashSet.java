package org.example.javacollections;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {

        Set<String> set= new HashSet<>();
        set.add(null);
        set.add(null);
        set.add("1 one");
        set.add("1 one");
        System.out.println(set.size());
        System.out.println(set);

        set.add("2 two");
        set.add("3 three");
        set.add("4 four");
        set.add("5 five");
        set.add("6 six");
        set.add("7 seven");
        set.add("8 eight");
        set.add("9 nine");
        set.add("10 ten");
        System.out.println(set);

        Set<String> set1= new HashSet<>();
        set1.add("11 eleven");
        set1.add("12 twelve");
        set1.add("13 thirteen");
        set1.add("14 fourteen");
        set1.add("15 fifteen");
        set1.add("16 sixteen");
        set1.add("17 seventeen");
        set1.add("18 eighteen");
        set1.add("19 nineteen");
        set1.add("20 twenty");

        set1.addAll(set);
        System.out.println("\nAfter adding all element from set to set1=> ");
        System.out.println(set1);

        set1.remove("9 nine");
        System.out.println("\nAfter removing 9 nine=>"+set1);

        set1.removeAll(set);
        System.out.println("\n after removing all set from set1=> "+ set1);

        System.out.println("\nExclude severn from list");
        set1.stream().filter(ele -> !"7 seven".equals(ele)).forEach(ele-> System.out.println(ele));

        set1.clear();
        System.out.println("\nAfter clear:"+set1);

    }
}
