package com.jeevocorp;

public class Person {
    String name = "";
    int age = 0;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void attack(){
        System.out.println(this.name+" punches the enemies!");
    }
}
