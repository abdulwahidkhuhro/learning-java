package com.java.learning.oop.lecture.two.innerclass;

public class InnerClass {
    class Test{
        private String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static void main(String[] args) {
        InnerClass innerClass =new InnerClass();
        innerClass.show();

//        Test test = new Test("Test Two");

    }

    public void show(){
        Test test = new Test("Test One");

        System.out.println(test);
    }
}
