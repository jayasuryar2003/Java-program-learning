package com.coding.java_learning.multithreading.thread_state;

public class ThreadState {

    static void main() throws InterruptedException {

        // New
        Thread t1 = new Thread(() -> {
            System.out.println("executing task"+Thread.currentThread().getName());
        });
        System.out.println(t1.getState());

        //Runnable
        t1.start();
        System.out.println(t1.getState());

        // Waiting
        Thread t2 = new Thread(() -> {
            System.out.println("executing task"+Thread.currentThread().getName());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();
        Thread.sleep(4);
        System.out.println(t2.getState());

        // terminated
        //blocked --> increment program with two thread and synchronized method
        //waiting --> fork




    }
}
