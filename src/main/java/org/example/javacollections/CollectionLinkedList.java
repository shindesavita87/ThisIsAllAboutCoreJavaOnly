package org.example.javacollections;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Fox");
        System.out.println("\nOriginal: => "+animals);

        System.out.println("\nAfter Add: => ");
        animals.addFirst("Tiger");
        animals.addLast("Zebra");
        animals.add(4,"Goat");
        animals.add(0,"Horse");
        animals.add(6,"Tiger");
        System.out.println(animals);

        System.out.println("\nFirst ele: =>"+animals.getFirst());
        System.out.println("\nFirst ele: =>"+animals.getLast());
        System.out.println("\nSpecified ele: =>"+animals.get(1));

        System.out.println("\nAfter Remove: => ");
        animals.removeFirst();
        animals.removeLast();
        animals.remove(4);
        animals.remove("Cat");
        System.out.println(animals);

        System.out.println("\n Check if linked list contains given element");
        System.out.println("\nIs it contains Dog: => "+animals.contains("Dog"));
        System.out.println("\nFind first index of specified element: => "+ animals.indexOf("Tiger"));
        System.out.println("\nFind last index of specified element: => "+ animals.lastIndexOf("Tiger"));
    }
}
