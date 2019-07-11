package com.jlu;

public class TestMobile {
    public static void main(String[] args) {
       Mobile mobile=new Mobile("mobile","red","benchi") ;
       mobile.call("[your input message]");
       Iphone iphone=new Iphone("iphone","black ","iphone","small");
       iphone.call("[your input message]");
       AndriodMobile andriodMobile=new AndriodMobile("apple","red","apple");
       andriodMobile.call("[your input message]");
       System.out.println("name:["+mobile.getName()+"],"+"color:["+mobile.getColor()+"],"+"brand:["+mobile.getBrand()+"]");
       mobile.call(" Message cannot be sent");
       andriodMobile.call("Message cannot be sent");

       Iphone iphoneRobot=new Iphone("huawei","green","androd","big");
       iphoneRobot.call("I can use iphone");
       Person person=new Person("lisi");
       person.call("your input message",iphone);
       person.call("I use andriodMobile",andriodMobile);

       IphoneRobot iphoneRobot1=new IphoneRobot();
       iphoneRobot1.usePhone(iphone);
    }
}
