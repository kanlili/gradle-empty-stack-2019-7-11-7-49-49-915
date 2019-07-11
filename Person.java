package com.jlu;

public class Person {
    public  String name;

    public Person(String name) {
        this.name = name;
    }
    public void call(String message,Iphone iphone){
        iphone.call(message);
    }
    public void call(String message,AndriodMobile andriodMobile ){
        andriodMobile.call(message);
    }

}
