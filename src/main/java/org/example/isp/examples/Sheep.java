package org.example.isp.examples;

public class Sheep implements Animal {

    @Override
    public void eat() {
        System.out.println("Sheep eating.");
    }

    @Override
    public void move(){
         System.out.println("Sheep moving.");
    }
}
