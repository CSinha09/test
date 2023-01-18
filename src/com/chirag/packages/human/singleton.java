package com.chirag.packages.human;

public class singleton {
    private singleton(){

    }

    private static singleton inst;

    public static singleton get_inst(){
        if(inst == null) inst=new singleton();
        return inst;
    }
}
