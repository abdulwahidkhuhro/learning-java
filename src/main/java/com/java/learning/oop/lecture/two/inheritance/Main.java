package com.java.learning.oop.lecture.two.inheritance;

public class Main {

    static void main(String[] args) {
        Box box = new BoxWeight(2, 3, 4, 8);
//        box.name();

        System.out.println(box.getLength());
    }
}
