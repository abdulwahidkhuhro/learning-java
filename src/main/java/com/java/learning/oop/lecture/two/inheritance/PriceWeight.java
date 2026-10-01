package com.java.learning.oop.lecture.two.inheritance;

public class PriceWeight extends BoxWeight{
    double cost;

    public PriceWeight(){
        super();
        cost = -1;
    }

    public PriceWeight(BoxWeight boxWeight){

    }
    public PriceWeight(int l, int w, int h, int weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
