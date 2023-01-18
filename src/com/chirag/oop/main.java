package com.chirag.oop;

public class main {
    public static void main(String[] args){
        final Student s1=new Student("Chirag");
        s1.name="New name";
        Student s2;
        for(int i=0; i<1000000000; i++){
            s2=new Student("Random");
        }
    }

}

class Student{
    final int rno=10;
    String name;

    public Student(String name){
        System.out.println("Object is created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
