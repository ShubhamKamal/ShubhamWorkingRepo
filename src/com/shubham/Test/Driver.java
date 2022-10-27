package com.shubham.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shubham3");
        list.add("shubham1");
        list.add("shubham2");

        List<String> list1= new ArrayList<>();
        list1.add("shubham4");
        list1.add("shubham1");
        list1.add("shubham2");

        List<String> list3 = list.stream().filter(s -> s.equals(list1.stream())).collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list = new ArrayList<>();
      /*  List<String> mobileList1 = new ArrayList<>();
        mobileList1.add("1");
        mobileList1.add("2");
        mobileList1.add("3");
        mobileList1.add("4");

        List<String> mobileList2 = new ArrayList<>();
        mobileList2.add("5");
        mobileList2.add("6");
        mobileList2.add("7");
        mobileList2.add("8");

        List<String> mobileList3 = new ArrayList<>();
        mobileList3.add("9");
        mobileList3.add("10");
        mobileList3.add("11");
        mobileList3.add("12");

        Student s1 = new Student();
        s1.setId("100");
        s1.setName("John1");
        s1.setMobile(mobileList1);

        Student s2 = new Student();
        s2.setId("200");
        s2.setName("John2");
        s2.setMobile(mobileList2);

        Student s3 = new Student();
        s3.setId("300");
        s3.setName("John3");
        s3.setMobile(mobileList3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        List s =  studentList.stream().filter(student -> student.getId().equals("200")).map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(s);*/
    }
}
