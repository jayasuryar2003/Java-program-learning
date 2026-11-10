package com.coding.java_learning.multithreading;

public class Increment {
    int count;
    public synchronized void increment(){
        count++;
    }
    public void run(){
        increment();
    }
}
