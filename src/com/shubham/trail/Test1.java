package com.shubham.trail;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<String> integerList = new ArrayList<>();
        integerList.add("d");
        integerList.add("e");
         Student student1 = new Student("a",12);
         student1.setStringList(integerList);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);

       /* studentList.stream().flatMap(student -> student.getStringList().stream())
                .collect(Collectors.toList()).add("t");

        studentList.stream().flatMap(student -> student.getStringList().stream())
                .forEach(s -> {
                    System.out.println(s);
                });*/

        List<String> integerList1 = new ArrayList<>();
        integerList1.add("y");
        integerList1.add("z");

       /* source.sequential()
                .collect(Collectors.toCollection(() -> target));*/

        //studentList.stream().flatMap(student -> student.getStringList().stream()).sequential().collect(Collectors.toCollection(()->integerList1));
        //source.forEachOrdered(target::add);
         /*studentList.stream()
                 .flatMap(student -> student.getStringList().stream())
                 .forEachOrdered(integerList1::add);*/

       studentList.stream().forEach(student -> {
           System.out.println(student.getName());
           System.out.println(student.getMobile());
           student.getStringList().addAll(integerList1);
           System.out.println(student.getStringList());
       });



    }
}
