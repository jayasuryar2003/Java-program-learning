package com.coding.java_learning.techapmlifiers_streamQA.string;



import java.util.*;
import java.util.stream.Collectors;

// 42 Question: From a list of employees, find the highest-paid employee in each department.
class Employee1 {
    String name, department;
    double salary;
    Employee1(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
    static void main() {
        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice", "HR", 50000),
                new Employee1("Bob", "IT", 80000),
                new Employee1("Charlie", "IT", 75000),
                new Employee1("Dave", "HR", 60000),
                new Employee1("Eve", "Finance", 70000)
        );
        Map<String, Employee1> highestPaid = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(e -> e.salary)),
                                Optional::get
                        )
                ));
        System.out.println(highestPaid);//--> we are implementing to string because employee is giving a object class tostring method
        // Map<String, Employee1> --> if you look out this you won't get a list<Employee> because we are using max by and we will only one employee each
        //max by will return an optional
// Output: {HR=Dave, IT=Bob, Finan


    }
}





