package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {
    ArrayList<Integer> score = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    Vector<Integer> vector = new Vector<>();
    public void manuplate() {
            score.add(4);
            System.out.println(score);
            score.get(0);


        list.add(3);
       for(Integer e: list) {
           System.out.println(list);
       }

    }
}
