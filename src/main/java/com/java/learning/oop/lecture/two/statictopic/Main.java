package com.java.learning.oop.lecture.two.statictopic;

public class Main {
    static void main(String[] args) {
        Human kunal = new Human(26, "Kunal Kushwaha", 25000, false);
        Human rahul = new Human(24, "Rahul", 35000, true);

        System.out.println("Population : "+kunal.getPopulation());
        System.out.println("Population : "+rahul.getPopulation());

//        Class claz = new Class.class();
    }
}
