package com.designpattern.sigletonpattern;

public class Animal {
    public static void main(String[] args) {
        // Dog class
        Dog dog = new Dog();
        dog.run("dog");

        // Bird class
        Bird bird = new Bird();
        bird.run("bird");
    }
}
