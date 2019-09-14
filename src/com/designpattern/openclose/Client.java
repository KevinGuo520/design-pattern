package com.designpattern.openclose;

public class Client {

    // 显示图像
    public void show(Shape s) {
        s.draw();
    }

    public static void main(String[] args) {

        Client client = new Client();

        client.show(new Triangle());
        client.show(new Rectangle());
        client.show(new Circle());
    }
}
