package com.shubham.trail;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);
        integerList1.add(5);

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(6);
        integerList2.add(2);
        integerList2.add(7);
        integerList2.add(4);
        integerList2.add(8);

        for (int i : integerList1){
            if(integerList2.contains(i))
               continue;

            System.out.println(i);
        }
    }
}
