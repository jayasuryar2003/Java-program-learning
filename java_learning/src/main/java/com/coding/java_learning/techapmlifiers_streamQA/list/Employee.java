package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 37 : Question: Group employees by department and then by age.
class Employee {
    String name, department;
    int age;
    Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 25),
                new Employee("Bob", "IT", 30),
                new Employee("Charlie", "HR", 30),
                new Employee("Dave", "IT", 25)
        );

        Map<String, Map<Integer, List<String>>> grouped = employees.stream() // --> how many gruop by you are adding that many maps will be greated so groupingby become your
                // key and ollectors.toList() become your value
                .collect(Collectors.groupingBy(e -> e.department,
                        Collectors.groupingBy(e -> e.age,//--> we can add multiple grouping by if your gruipng by requires more values to group
                                Collectors.mapping(e -> e.name, Collectors.toList())))); //--> this will separate the value from the list and put it into the list
        System.out.println(grouped);

        //The Collectors.mapping() method is a specialized collector in Java that transforms (maps) elements before collecting them into a final structure.
        // It is almost always used as a downstream collector inside Collectors.groupingBy() or Collectors.partitioningBy().The SyntaxjavaCollectors.mapping(mapperFunction, downstreamCollector)
        //Use code with caution.mapperFunction: A lambda expression or method reference that extracts or transforms the data
        // (like s -> s.name).downstreamCollector: The collector that gathers the transformed items (like Collectors.toList() or Collectors.toSet()).

//        Why Do We Need It? (The Problem)Imagine you have a list of Student objects, and you want to group them by their
//        Grade ("A", "B", etc.).If you use standard groupingBy(), you get a map of the entire student objects:java// Returns: Map<String, List<Student>>
//        Map<String, List<Student>> studentsByGrade = students.stream()
//                .collect(Collectors.groupingBy(Student::getGrade));
//        Use code with caution.The Solution: Using Collectors.mapping()What if you don't want the full Student objects?
//        What if you only want a list of student names for each grade? This is exactly where Collectors.mapping() shines:javaimport java.util.*;
//import java.util.stream.Collectors;
//
//        public class Main {
//            static class Student {
//                String name;
//                String grade;
//                Student(String name, String grade) { this.name = name; this.grade = grade; }
//                String getName() { return name; }
//                String getGrade() { return grade; }
//            }
//
//            public static void main(String[] args) {
//                List<Student> students = Arrays.asList(
//                        new Student("Alice", "A"),
//                        new Student("Bob", "B"),
//                        new Student("Charlie", "A")
//                );
//
//                // Group by grade, but extract ONLY the names into a List
//                Map<String, List<String>> namesByGrade = students.stream()
//                        .collect(Collectors.groupingBy(
//                                Student::getGrade,
//                                Collectors.mapping(Student::getName, Collectors.toList()) // <-- Here it is!
//                        ));
//
//                System.out.println(namesByGrade);
//                // Output: {A=[Alice, Charlie], B=[Bob]}
//            }
//        }
//        Use code with caution.Clean Rule of ThumbUse .map() directly on a stream when you want to transform elements sequentially mid-pipeline.Use Collectors.mapping() when you are nested inside a grouping operation and need to transform the values assigned to your map keys.Would you like to see how to use Collectors.mapping() with other collectors, like combining it with Collectors.joining(", ") to get a comma-separated string of names instead of a list?
    }
}


