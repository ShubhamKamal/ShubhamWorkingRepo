package com.shubham.Test;

import java.util.*;

public class Sample1 {

    public static void main(String[] args) {
        Set set = new HashSet();

        Rat rat1 = new Rat(1,"ram1",12);
        Rat rat2 = new Rat(1,"ram1",12);
        Rat rat3 = new Rat(3,"ram1",12);
        Rat rat4 = new Rat(4,"ram1",12);
        Rat rat5 = new Rat(5,"ram1",12);

        List<Rat> ratList = new ArrayList<>();
        ratList.add(rat1);
        ratList.add(rat2);

        set.add(rat1);
        set.add(rat2);

        ratList.stream().forEach(rat -> {
            System.out.println(rat);
        });

        System.out.println("========================");

        set.stream().forEach(rat -> {
            System.out.println(rat);
        });

    }
}

class Rat{
    private int id;
    private String name;
    private long mobile;

    public Rat(int id, String name, long mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Rat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rat)) return false;
        Rat rat = (Rat) o;
        return id == rat.id && mobile == rat.mobile && name == rat.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobile);
    }
}
