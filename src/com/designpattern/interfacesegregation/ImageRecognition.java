package com.designpattern.interfacesegregation;

public class ImageRecognition implements ImageInterface {

    @Override
    public void showImage(String image_name) {
        System.out.println("显示图片: " + image_name);
    }
}
