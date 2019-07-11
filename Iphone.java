package com.jlu;

public class Iphone extends Mobile{
    private String style;

    public Iphone(String name, String color, String brand, String style) {
        super(name, color, brand);
        this.style = style;
    }

    @Override
    public void call(String message) {
        if(message.length()>4) {
            System.out.println("<iPhone>Message : " + message);
            super.call(message);
        }
    }
}
