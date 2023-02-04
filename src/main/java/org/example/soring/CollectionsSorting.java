package org.example.soring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
    public static void main(String[] args) {
        List<Integer> noList=new ArrayList<>();
        noList.add(20);
        noList.add(05);
        noList.add(07);
        noList.add(03);
        noList.add(1987);
        System.out.println("Original: "+noList);

        Collections.sort(noList);
        System.out.println("After sort: "+noList);

        Collections.reverse(noList);
        System.out.println("After reverse: "+noList);

        Collections.shuffle(noList);
        System.out.println("After shuffle: "+noList);
    }
}
