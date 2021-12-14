package com.jeevocorp;

public class Car {
    String make = "";
    String model = "";
    int year = 0;
    double tankSize = 0;
    double autonomy = 0;

    Car() {
    }

    Car(String make){
        this.make = make;
    }

    Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(String make, String model, int year, double tankSize){
        this.make = make;
        this.model = model;
        this.year = year;
        this.tankSize = tankSize;
    }

    Car(String make, String model, int year, double tankSize, double autonomy){
        this.make = make;
        this.model = model;
        this.year = year;
        this.tankSize = tankSize;
        this.autonomy = autonomy;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public void setAutonomy(double autonomy) {
        this.autonomy = autonomy;
    }

    @Override
    public String toString(){
        return make+ ", "+model+ ", "+year+ ", "+tankSize+ ", "+autonomy+".";
    }

    public void brake(){
        System.out.println("SKKRRRR!");
    }

    public void throttle(){
        System.out.println("VROOOOM!");
    }
}
