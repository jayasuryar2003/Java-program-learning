package com.coding.java_learning.nataraj.day1;

public class MultiThreading  {
    static void main() {
         Mytask mytask = new Mytask();
         mytask.start();

        Thread thread1 = new Thread(()-> {
            System.out.println("rUNNING IN:"+Thread.currentThread().getName());
        });
        thread1.start();

        Runnable runnable =
                ()-> {
                    System.out.println("rRUNNING IN:"+Thread.currentThread().getName());
                    System.out.println("rRUNNING IN:"+Thread.currentThread().getState());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                };
        Thread thread2 = new Thread(runnable,"surya");
        thread2.start();


    }




}

class Mytask extends Thread {
    @Override
    public void run() {
        System.out.println("rUNNING IN:"+Thread.currentThread().getName());
    }
}

