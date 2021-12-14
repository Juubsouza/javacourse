package com.jeevocorp;

public class Hero extends Person{
    String power = "";

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public void attack(){
        System.out.println(this.name+" uses his power of "+this.power+" to attack the enemies!");
    }
}
