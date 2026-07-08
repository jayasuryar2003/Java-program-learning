package com.coding.java_learning.techapmlifiers_streamQA.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 33 Question: From a list of students, find the top 3 by score.
public class FindTopNHighestScoringStudents {

    static void main() {
        class Student {
            String name;
            int score;
            Student(String name, int score) { this.name = name; this.score = score; }
        }

        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 88),
                new Student("Dave", 78),
                new Student("Eve", 91)
        );
       List<String> topThreeStudents = students.stream()
               .sorted(Comparator.comparingInt((Student s) -> s.score).reversed()) // --> if you are using object inside the list parse it to the student becuase it is coming as object
               // this is only applicable for the objects
               .limit(3)
               .map(s-> s.name)
               .collect(Collectors.toList());
        System.out.println(topThreeStudents);

//        .sorted(Comparator.comparingInt(Student::getScore).reversed())--> if you have getters you can use it like this


    }
}
