package com.coding.java_learning.multithreading.basic.runnable;

public class Task3 implements Runnable
{
    public void print (){
        System.out.println("Task3 executing "+ Thread.currentThread().getName());
    }
    public void run(){
        print();
    }
}
