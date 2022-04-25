package com.example.cardock_2;

import java.util.ArrayList;

public class Wishlist {
    private int carCount=0;
    private String carReg;
    private ArrayList<String> carList;

    public Wishlist(String car){
        this.carReg=car;
    }
    public void addCarToWishlist(String car){
        //Add car to wish list
        carList.add(car);
        carCount++;
    }
    public void removeFromWishList(String car){
        ////remove car from wishlist
        carList.remove(car);
        carCount--;
    }


}
