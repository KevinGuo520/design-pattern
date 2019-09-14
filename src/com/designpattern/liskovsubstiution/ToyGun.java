package com.designpattern.liskovsubstiution;

public class ToyGun implements InterfaceToy {

    private InterfaceGun gun;

    public ToyGun(InterfaceGun gun) {

        this.gun = gun;
    }

    @Override
    public void playGun() {

        System.out.println("使用玩具枪");
    }
}
