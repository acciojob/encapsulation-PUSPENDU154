package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
//       obj.name="Puspendu";
        obj.setName("Puspendu");
        System.out.println(obj.getName());
    }


}