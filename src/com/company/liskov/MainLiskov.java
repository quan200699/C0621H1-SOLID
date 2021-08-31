package com.company.liskov;

public class MainLiskov {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Diện tích hcn:" + rectangle.getArea());
        Shape square = new Square(10);
        System.out.println("Diện tích hv:" + square.getArea());
    }
}
