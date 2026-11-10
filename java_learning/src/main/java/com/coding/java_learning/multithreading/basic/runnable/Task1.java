package com.coding.java_learning.multithreading.basic.runnable;

public class Task1 implements Runnable{
    public void print (){
        System.out.println("Task1 executing "+ Thread.currentThread().getName());
    }
    public void run(){
        print();
    }
}
