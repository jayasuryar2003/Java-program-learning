package com.coding.java_learning.multithreading;

public class Synchronized {
    static void main() throws InterruptedException {
        Increment increment = new Increment();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(increment.count);
    }

}

