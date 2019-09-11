package com.designpattern.interfacesegregation;

public class VideoRecognition implements VideoInterface {

    @Override
    public void showVideo(String video_name) {
        System.out.println("识别视频中的人物: " + video_name);
    }
}
