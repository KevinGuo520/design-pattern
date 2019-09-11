package com.designpattern.dpendencyinversion.type02;

public class TVControl implements ITVControl {

    private ITV tv;

    public TVControl(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {

        this.tv.play();
    }
}
