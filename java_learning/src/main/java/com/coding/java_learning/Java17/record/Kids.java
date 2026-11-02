package com.coding.java_learning.Java17.record;

public record Kids(String name, int age) {

    private static int count = 0;
    public Kids{
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
