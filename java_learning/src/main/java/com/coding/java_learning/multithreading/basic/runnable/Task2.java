package com.coding.java_learning.multithreading.basic.runnable;

public class Task2 implements Runnable{
    public void print (){
        System.out.println("Task2 executing "+ Thread.currentThread().getName());
    }
    public void run(){
        print();
    }
}
