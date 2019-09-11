package com.designpattern.interfacesegregation;

public class Client {

    // 显示图片窗口
   public void ImageWin(ImageInterface inter) {

       inter.showImage("dog");
   }

   // 视频窗口
   public void VideoWin(VideoInterface inter) {

       inter.showVideo("face video");
   }

    public static void main(String[] args) {

        Client client = new Client();
        // 调用图片窗
        client.ImageWin(new ImageRecognition());

        // 调用视频窗口
        client.VideoWin(new VideoRecognition());

        // 调用实时识别窗口
        client.VideoWin(new RealTimeRecognition());
    }
}
