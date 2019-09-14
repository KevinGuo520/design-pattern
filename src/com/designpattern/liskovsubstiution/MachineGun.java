package com.designpattern.liskovsubstiution;

public class MachineGun implements InterfaceGun {

    @Override
    public void shoot() {
        System.out.println("使用机枪射击...");
    }
}
