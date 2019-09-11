package com.designpattern.dpendencyinversion.type03;

public class TVControl implements ITVControl {

    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {

        this.tv.play();
    }
}
