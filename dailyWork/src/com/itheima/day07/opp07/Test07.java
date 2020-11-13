package com.itheima.day07.opp07;

/**
 * 请定义一个描述矩形（MyRectangle）的类，包含宽和高两个属性，
 * 提供获取矩形周长（perimeter）和面积（area）的方法。
 * 并编写测试类进行测试。
 */
public class Test07 {
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle(3, 2);
        myRectangle.perimeter();
        myRectangle.area();
    }
}

class MyRectangle {
    private double high;
    private double weigh;

    public MyRectangle() {
    }

    public MyRectangle(double high, double weigh) {
        this.high = high;
        this.weigh = weigh;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public void perimeter() {
        System.out.println("矩形周长为：" + (high + weigh) * 2);
    }

    public void area() {
        System.out.println("矩形面积为：" + high * weigh);
    }
}
