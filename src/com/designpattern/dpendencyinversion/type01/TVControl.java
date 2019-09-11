package com.designpattern.dpendencyinversion.type01;

public class TVControl implements ITVControl {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
