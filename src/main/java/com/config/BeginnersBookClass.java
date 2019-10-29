package com.config;
@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
    default void test(){
        System.out.println("Testing");

    }
    default void test2(){
        System.out.println("Testing");

    }
    static void test1(){
        System.out.println("Testing");

    }
}
public class BeginnersBookClass implements MyFunctionalInterface  {



    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
        MyFunctionalInterface.test1();
    }
    public int addMethod(int a, int b){
        return 5;
    }
}