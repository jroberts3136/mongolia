package com.company;
/**
 * Created by jroberts3136 on 4/26/18.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H {
    public static void main(String[] args) {
        ArrayList <Integer> h = new  ArrayList<Integer>();
        h.add(7);
        h.add(1);
        h.add(9);
        h.add(3);
        h.add(2);
        h.add(4);
        System.out.println(h);
        h(h);
        System.out.println(h);
    }

    public static <H extends Comparable<H>> void h(List<H> h) {
        if (h.size() <= 1)
            return;
        while (!isSorted(h))
            Collections.shuffle(h);
    }

    public static <H extends Comparable<H>> boolean isSorted(List<H> h) {
        List<H> hh = new ArrayList<>(h);
        List<H> hhh;
        do {
            Collections.shuffle(hh);
            hhh = hh.subList(0, hh.size() - 1);
            h(hhh);
        } while (hh.get(hh.size() - 1).compareTo(hhh.get(hhh.size() - 1)) < 0);
        return hh.equals(h);
    }
}
//https://github.com/lucaswerkmeister/Miscellaneous/blob/master/Sorting/src/Bogobogosort.java
