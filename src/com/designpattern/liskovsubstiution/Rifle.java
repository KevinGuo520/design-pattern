package com.designpattern.liskovsubstiution;

public class Rifle implements InterfaceGun {

    @Override
    public void shoot() {
        System.out.println("使用步枪射击...");
    }
}
