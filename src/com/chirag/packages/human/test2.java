package com.chirag.packages.human;

public class test2 {
    public static void main(String[] args){
        test1 t1=new test1(22, "chirag");
        test1 t2=new test1(21, "aman");
        System.out.println(test1.pop);
        System.out.println(test1.pop);

        test2 t=new test2();
        t.greet();

        singleton a=singleton.get_inst();

    }

    void greet(){
        System.out.println("Abcdefgh");
    }
}
