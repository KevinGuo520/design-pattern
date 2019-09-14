package com.designpattern.liskovsubstiution;

public class HandGun implements InterfaceGun {

    @Override
    public void shoot() {
        System.out.println("使用手枪射击...");
    }
}
