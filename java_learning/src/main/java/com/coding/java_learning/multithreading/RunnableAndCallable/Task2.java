package com.coding.java_learning.multithreading.RunnableAndCallable;

import java.util.concurrent.Callable;

public class Task2 implements Callable {

    @Override
    public Object call() throws Exception {
        return 20000;
    }
}
