package com.coding.java_learning.multithreading.basic.thread_class;

public class Task3 extends Thread
{
    public void print (){
        System.out.println("Task3 executing "+ Thread.currentThread().getName());
    }
    public void run(){
        print();
    }
}
