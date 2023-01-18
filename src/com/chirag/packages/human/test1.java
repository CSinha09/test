package com.chirag.packages.human;

public class test1 {
    int age;
    String name;
    static long pop;
    public test1(int age, String name){
        this.age=age;
        this.name=name;
        test1.pop+=1;
    }

}
