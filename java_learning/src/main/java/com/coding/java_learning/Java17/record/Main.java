package com.coding.java_learning.Java17.record;

public class Main {

    static void main() {
        Person person = new Person("John", 30);
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 40);
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person.equals(person2));
        System.out.println(person.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person.name());
        System.out.println(person.age());



        //Kids
        Kids kids = new Kids("John",  10);
        Kids kids1 = new Kids("Jane",  15);
        Kids kids2 = new Kids("Bob",  11);
        kids.printDetails();
        System.out.println("Count: " + Kids.getCount());
    }


}
