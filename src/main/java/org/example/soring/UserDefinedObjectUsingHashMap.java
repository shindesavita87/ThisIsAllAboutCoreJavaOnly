package org.example.soring;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedObjectUsingHashMap {
    public static void main(String[] args) {
        Map<Integer,Students> studentsMap=new HashMap<Integer,Students>();
        studentsMap.put(1, new Students(1,"Savita",650000,'A'));
        studentsMap.put(2, new Students(2,"Kavita",20000,'B'));
        studentsMap.put(3, new Students(3,"Yogita",450000,'F'));
        studentsMap.put(4, new Students(4,"Rakesh",300000,'C'));
        studentsMap.put(5, new Students(5,"Mahesh",89000,'E'));
        studentsMap.put(6, new Students(6,"Pramesh",290000,'D'));

        System.out.println(studentsMap);

        System.out.println("Only values: "+ studentsMap.values());

        System.out.println("Only Keys: "+studentsMap.keySet());
    }
}
