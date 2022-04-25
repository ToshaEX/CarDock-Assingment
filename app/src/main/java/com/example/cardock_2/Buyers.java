package com.example.cardock_2;

public class Buyers {
    private String name,email,password;
    private int phone;

    //constructor
    public Buyers(String name,String email,String password,int phone){
        this.email=email;
        this.password=password;
        this.phone=phone;
        this.name=name;
    }
    //login method
    public boolean login(){
        //check user credentials are valid or not
        boolean isSuccess=false;
        return  isSuccess;
    }

    //signup method
    public void signUp(){
        //Register user
    }
}
