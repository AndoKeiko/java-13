package org.example;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    List<Student> studentList = (List<Student>) IntStream.range(0, 10)
        .mapToObj(i -> new Student(UUID.randomUUID().toString(), "江並" + 1)).toList();
    StudentManager manager = new StudentManager(studentList);

    Student student = manager.search("江並");
    System.out.println(student.getName());
  }
}