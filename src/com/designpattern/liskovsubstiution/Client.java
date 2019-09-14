package com.designpattern.liskovsubstiution;

public class Client {

    public static void main(String[] args) {

        Soldier soldier = new Soldier();
        soldier.killEnemy(new MachineGun());

        // 玩具枪
        soldier.playGun(new ToyGun(new MachineGun()));
    }
}
