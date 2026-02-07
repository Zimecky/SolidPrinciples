package org.example.isp.examples;

public class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Fish eating.");
    }

    @Override
    public void move(){
        System.out.println("Fish moving.");
    }
}
