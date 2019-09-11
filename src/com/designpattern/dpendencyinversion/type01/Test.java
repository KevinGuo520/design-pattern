package com.designpattern.dpendencyinversion.type01;

public class Test {

    public static void main(String[] args) {

        // 创建电视控制器
        TVControl tvControl = new TVControl();

        // 打开电视
        tvControl.open(new ChangHong());
        tvControl.open(new XiMi());
        tvControl.open(new KangJia());
    }
}
