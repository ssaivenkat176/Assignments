package com.assignment.task6;

public class Triangle {
    // We can change this to an array
    private int side1;
    private int side2;
    private int side3;

    public Triangle() {


    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double calculateArea() {
        return 0.5 * side1 * side2;
    }
    public int calculatePerimeter() {
        return side1 + side2 + side3;

    }


  public static void main(String args[]) {

        Triangle triangle = new Triangle();
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        System.out.println("The triangle has area of " + triangle.calculateArea());
        System.out.println("The triangle has perimeter of " + triangle.calculatePerimeter());
  }

}
