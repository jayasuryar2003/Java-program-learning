package com.coding.java_learning.multithreading.RunnableAndCallable;

import com.coding.java_learning.multithreading.basic.runnable.Task2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableAndCallable {
    static void main() {
        Thread t1 = new Thread(new Task1());
        Thread t2  = new Thread(new Task2());

        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        executorService.submit(t1);
//        executorService.submit(t2);


//        executorService.submit(new Task1());
//        executorService.submit(new Task2());











    }
}
