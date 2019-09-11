package com.designpattern.dpendencyinversion.type02;

public class Test {

    public static void main(String[] args) {

        // 创建电视控制器
        ChangHong changHong = new ChangHong();
        XiMi xiMi = new XiMi();
        KangJia kangJia = new KangJia();

        // 打开电视
        new TVControl(changHong).open();
        new TVControl(xiMi).open();
        new TVControl(kangJia).open();

    }
}
