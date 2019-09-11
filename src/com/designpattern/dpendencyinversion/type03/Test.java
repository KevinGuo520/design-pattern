package com.designpattern.dpendencyinversion.type03;

public class Test {

    public static void main(String[] args) {

        // 创建电视控制器
        TVControl tvControl = new TVControl();

        // 打开电视
        tvControl.setTv(new ChangHong());
        tvControl.open();

        tvControl.setTv(new XiMi());
        tvControl.open();

        tvControl.setTv(new KangJia());
        tvControl.open();

    }
}
