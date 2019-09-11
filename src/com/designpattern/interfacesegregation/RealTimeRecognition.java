package com.designpattern.interfacesegregation;

public class RealTimeRecognition implements VideoInterface {

    @Override
    public void showVideo(String video_name) {
        System.out.println("实时识别: " + video_name);
    }
}
