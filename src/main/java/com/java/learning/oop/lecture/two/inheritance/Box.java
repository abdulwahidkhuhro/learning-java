package com.java.learning.oop.lecture.two.inheritance;

public class Box {
    private int length;
    private int width;
    private int height;
    private String type;

    public Box(){
        length = -1;
        width = -1;
        height = -1;
    }

    public Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void type(){
        System.out.println("Box");
    }
}
