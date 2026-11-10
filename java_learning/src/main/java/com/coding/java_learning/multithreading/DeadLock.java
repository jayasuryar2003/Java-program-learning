package com.coding.java_learning.multithreading;

import com.coding.java_learning.multithreading.thread_state.BankBalance;

public class DeadLock {
    static void main() {
        BankBalance bankBalance1 = new BankBalance();
        BankBalance bankBalance2 = new BankBalance();

        Thread t1 = new Thread(()->{
            synchronized (bankBalance1){
                bankBalance1.balance();
            }
            synchronized (bankBalance2){
                bankBalance2.balance();
            }

        });

        Thread t2 = new Thread(()->{
            synchronized (bankBalance2){
                bankBalance2.balance();
            }
            synchronized (bankBalance1){
                bankBalance1.balance();
            }


        });

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
