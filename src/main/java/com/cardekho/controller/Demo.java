package com.cardekho.controller;

public class Demo {

    public String method(){
        Demo d = new Demo();
        System.out.println("this is without add .");
        return "friend";
    }

    public void method2(){
        System.out.println("this is after add .");
        Demo d1 = new Demo();
    }



}
