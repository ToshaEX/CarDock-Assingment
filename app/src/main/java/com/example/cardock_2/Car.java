package com.example.cardock_2;

public class Car {

    private String carRegNum,model,brand;
    private int year,seat,price;

    //constructor
    public Car(String carRegNum, String model,String brand,int year,int seat,int price){
        this.brand=brand;
        this.carRegNum=carRegNum;
        this.model=model;
        this.year=year;
        this.seat=seat;
        this.price=price;
    }

    public void viewVehicle(){
        //share veheicle data to cycleview
    }
    public void editVehicle(){
        //update vehicle registered data
    }
    public String showCars(){
        return "reg: "+this.carRegNum;
    }

    public boolean buyVehicle(){
        boolean isSuccess=false;
        //payment process
        return isSuccess;
    }
}
