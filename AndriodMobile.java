package com.jlu;

public class AndriodMobile extends Mobile{

    public AndriodMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if(message.length()>6) {
            System.out.println("<Andriod>Message : " + message);
            super.call(message);
        }else{
            System.out.println(message);
        }
    }
}
