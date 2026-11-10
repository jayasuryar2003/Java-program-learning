package com.coding.java_learning.multithreading.basic.runnable;

public class Main {
    static void main() {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        // --> traditional way of creating it in the creating a thread class passing the Runnable object

//        Thread t1 = new Thread(task1);
//        Thread t2 = new Thread(task2);
//        Thread t3 = new Thread(task3);

        // --> traditional way of creating it in the creating a thread class passing  and creating the Runnable object directly
//        Thread t1 = new Thread(new Task1());
//        Thread t2 = new Thread(new Task2());
//        Thread t3 = new Thread(new Task3());

        // functional interface style
        Thread t1 = new Thread(() -> System.out.println("Task1 executing "+ Thread.currentThread().getName()));
        Thread t2 = new Thread(() -> System.out.println("Task2 executing "+ Thread.currentThread().getName()));
        Thread t3= new Thread(() -> System.out.println("Task3 executing "+ Thread.currentThread().getName()));









        task1.run();
        task2.run();
        task3.run();

        t1.start();
        t2.start();
        t3.start();


    }
}
