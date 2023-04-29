package com.assignment.task6;

class Student {

    private String name;
    private int enrollmentNo;

    public Student(String name, int enrollmentNo) {
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }

    @Override
    public String toString() {

        return "Student details {" +
                "name='" + name + '\'' +
                ", enrollmentNo=" + enrollmentNo +
                '}';
    }
}

public class Problem1 {

    public static void main(String args[]) {
        Student student = new Student("Amay", 132);
        System.out.println(student);

    }

}
