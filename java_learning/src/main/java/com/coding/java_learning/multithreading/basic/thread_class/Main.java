package com.coding.java_learning.multithreading.basic.thread_class;

public class Main {
    static void main() {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        task1.run();
        task2.run();
        task3.run();

        task1.start();
        task2.start();
        task3.start();


    }
}
