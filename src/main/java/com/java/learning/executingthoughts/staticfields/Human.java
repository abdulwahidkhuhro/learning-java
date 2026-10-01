package com.java.learning.executingthoughts.staticfields;

public class Human {
    public String name;
    public static int population;
    public static int dead;

    public Human(){
        population++;
        System.out.println("Born : "+population+" - dead : "+(population-dead));
    }

    @Override
    public void finalize(){
        dead++;
    }

}
