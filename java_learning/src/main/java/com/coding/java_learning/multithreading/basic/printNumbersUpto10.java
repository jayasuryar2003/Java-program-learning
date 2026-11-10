package com.coding.java_learning.multithreading.basic;

public class printNumbersUpto10 {
    //odd no and even numbers shoul be printed in two diffrernt threads

    static void main() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 29; i = i+2) {
                System.out.println(i);
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }



        });
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 30; i = i+2) {
                System.out.println(i);

                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        t1.start();
        Thread.sleep(2);
        t2.start();
    }
}
