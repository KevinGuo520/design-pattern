package com.designpattern.liskovsubstiution;

public class Soldier {

    public void killEnemy(InterfaceGun gun) {
        System.out.println("士兵准备射击");
        gun.shoot();
    }

    public void playGun(InterfaceToy toy) {
        System.out.println("士兵准备玩枪");
        toy.playGun();
    }
}
