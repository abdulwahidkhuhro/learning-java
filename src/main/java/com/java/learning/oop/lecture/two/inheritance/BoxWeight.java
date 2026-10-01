package com.java.learning.oop.lecture.two.inheritance;

public class BoxWeight extends Box{
    public int weight;

    public BoxWeight(){
        super();
        weight = -1;
    }

    public BoxWeight(BoxWeight boxWeight){
        super(boxWeight);
        weight = boxWeight.weight;
    }
    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public void name(){
        System.out.println("Box Weight");
    }

}
