package com.coding.java_learning.nataraj.day1;

import java.util.concurrent.*;

public class MultiThreading {
    static void main() throws ExecutionException, InterruptedException {
        Callable<Integer> callable = ()->{
            return 42;
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(callable);
        System.out.println(future.get());
        executorService.shutdown();

    }
}

//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//    }
//}


