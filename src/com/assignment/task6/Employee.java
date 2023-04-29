package com.assignment.task6;

public class Employee {

    private String name;
    private String address;
    private int year;
    private double salary;

    public Employee(String name, String address, int year, double salary) {
        this.name = name;
        this.address = address;
        this.year  = year;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + '|' + " " +
                 year +  " " + '|' + " " +
                address + " " ;
    }

    public static void main(String args[]) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Robert", "64C- Walls Street",1995,36000);
        employees[1] = new Employee("Sam", "68D- Walls Street",2000,40000);
        employees[2] = new Employee("John", "26B- Walls Street",1999,36000);

        System.out.println(" Name | Year of Joining  | Address ");
        System.out.println("---------------------------------");
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);



    }
}
