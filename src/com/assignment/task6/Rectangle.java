package com.assignment.task6;


public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public Rectangle() {
       this(0,0);
    }

    public Rectangle(double dimension) {
        this(dimension, dimension);
    }

    public double getAreaRectangle() {
        return this.length * this.breadth;
    }
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        System.out.println("Area of above rectangle is " + rectangle.getAreaRectangle());
        System.out.println();
        Rectangle rectangle1 = new Rectangle(9);
        System.out.println(rectangle1);
        System.out.println("Area of above rectangle is " + rectangle1.getAreaRectangle());

        System.out.println();

        Rectangle rectangle2 = new Rectangle(12,9);
        System.out.println(rectangle2);
        System.out.println("Area of above rectangle is " + rectangle2.getAreaRectangle());


    }
}
