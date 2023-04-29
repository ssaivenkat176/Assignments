package com.assignment.task6;

class Student1 {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student1() {
        this("Unknown");

    }
    public Student1(String name) {
        this.name = name;


    }
}

public class Problem4 {

    public static void main(String args[]) {

        Student1 student= new Student1();
        Student1 student1 = new Student1("Sachin");
        System.out.println(student);
        System.out.println(student1);

    }
}
