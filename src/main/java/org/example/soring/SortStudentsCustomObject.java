package org.example.soring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentsCustomObject {
    public static void main(String[] args) {

        List<Students> stud=new ArrayList<>();
        stud.add(new Students(1,"Savita",650000,'A'));
        stud.add(new Students(2,"Kavita",20000,'B'));
        stud.add(new Students(3,"Yogita",450000,'F'));
        stud.add(new Students(4,"Rakesh",300000,'C'));
        stud.add(new Students(5,"Mahesh",89000,'E'));
        stud.add(new Students(6,"Pramesh",290000,'D'));

        System.out.println("//ascending order=>");
        Collections.sort(stud,new MySort());//ascending order
        stud.forEach((s)-> System.out.println(s));

        System.out.println("\n//descending order=>");
        Collections.sort(stud,new MySort1());//descending order
        stud.forEach((s)-> System.out.println(s));

        Collections.sort(stud, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o2.getRollNo() -o1.getRollNo();
            }
        });
        System.out.println("\nAfter sorting roll no desc order=>");
        stud.forEach((s)-> System.out.println(s));

        System.out.println("\nAfter sorting roll no asc order=>");
        Collections.sort(stud,(o1, o2) -> (o1.getRollNo()-o2.getRollNo()));
        stud.forEach((s)-> System.out.println(s));

        System.out.println("\nAfter sorting student name in asc order=>");
        Collections.sort(stud,(o1, o2) -> (o1.getName().compareTo(o2.getName())));
        stud.forEach((s)-> System.out.println(s));
    }
}

class MySort implements Comparator<Students>{

    //this will sort ascending order
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getFees() -o2.getFees();
    }
}

class MySort1 implements Comparator<Students>{

    //this will sort descending order
    @Override
    public int compare(Students o1, Students o2) {
        return o2.getFees() -o1.getFees();
    }
}