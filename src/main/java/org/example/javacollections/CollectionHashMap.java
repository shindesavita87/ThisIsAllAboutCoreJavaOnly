package org.example.javacollections;

import java.util.*;

//Values can be duplicate however keys are unique
public class CollectionHashMap {
    public static void main(String[] args) {
        Map<Number,String> map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");

        System.out.println("\nOnly one null value will be accepted...");
        map.put(null,"Six");
        map.put(null,"Seven");

        System.out.println(map);

        System.out.println("\n//Check if a HashMap is empty. "+map.isEmpty());

        System.out.println("\nGet size of map: "+map.size());

        if(map.containsKey(5))
        {
            System.out.println("5 key is exist.");
        }
        if(map.containsValue("Four"))
        {
            System.out.println("Four exist.");
        }

        System.out.println("\nHow to get value by its key.");
        String s=map.get(3);
        System.out.println(s);

        System.out.println("\nRemove key-value using key.");
        map.remove(2);
        System.out.println(map );

        Set<Number> onlyKeys = map.keySet();
        System.out.println("\n Only Keys: "+onlyKeys);

        Collection<String> onlyValues = map.values();
        System.out.println("\nOnly values: "+onlyValues);

        System.out.println("\nDifferent ways of iterating through Hashmap.");
        //Map.Entry will get entry in HashMap
        // entrySet returns set of entries

        System.out.println("\nWith using foreach loop.");
        for (Map.Entry<Number,String> entry:map.entrySet())
        {
            System.out.println("Key -> "+ entry.getKey()+ " Value -> "+ entry.getValue());
        }

        System.out.println("\nUsing Iterator.");
        Set<Map.Entry<Number,String>> entries=map.entrySet();
        Iterator<Map.Entry<Number,String>> iterator= entries.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Number,String> entry=iterator.next();
            System.out.println("Key -> "+ entry.getKey()+ " Value -> "+ entry.getValue());
        }

        System.out.println(("\nUsing Java 8 forEach method"));
        map.forEach((K,V)-> {
            System.out.println("Key -> "+ K+ " Value -> "+ V);
        });
    }
}
