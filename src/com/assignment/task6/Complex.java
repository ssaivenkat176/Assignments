package com.assignment.task6;

import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two complex numbers with real and imaginary parts....");
        System.out.println("Enter first complex number's real part... ");
        double real1 = sc.nextDouble();

        System.out.println("Enter first complex number's imaginary part... ");

        double img1 = sc.nextDouble();

        System.out.println("Enter second complex number's real part... ");
        double real2 = sc.nextDouble();

        System.out.println("Enter second complex number's imaginary part... ");

        double img2 = sc.nextDouble();


        Complex complex[] = new Complex[2];
        complex[0] = new Complex(real1, img1);
        complex[1] = new Complex(real2, img2);
        addComplexNumbers(complex[0], complex[1]);

        subComplexNumbers(complex[0],complex[1]);
        productOfComplexNumbers(complex[0],complex[1]);



    }

    private static void addComplexNumbers(Complex complex1, Complex complex2) {
        char symbol = (complex1.getImaginary() + complex2.getImaginary()) < 0 ? '-' : '+';

        System.out.println("The sum of the two complex numbers is " +
                (complex1.getReal() + complex2.getReal()) + symbol + "i"+
                Math.abs((complex1.getImaginary() + complex2.getImaginary())));
    }
    private static void subComplexNumbers(Complex complex1, Complex complex2) {

        char symbol = (complex1.getImaginary() - complex2.getImaginary()) < 0 ? '-' : '+';
        System.out.println("The differehce of the two complex numbers is " +
                (complex1.getReal() - complex2.getReal()) + symbol + "i"+
                Math.abs((complex1.getImaginary() - complex2.getImaginary())));
    }

    // (a + ib) (c + id) = (ac - bd) + i(ad + bc) [

    private static void productOfComplexNumbers(Complex complex1, Complex complex2) {

        double a = complex1.getReal();
        double b = complex1.getImaginary();
        double c = complex2.getReal();
        double d = complex2.getImaginary();

        double product1 = a*c - b*d;
        double product2  = a*d + b*c;
        char symbol = product2 < 0 ? '-' : '+';

        System.out.println("The product of the two complex numbers is " +
                product1 + symbol +" i"+
                Math.abs(product2));

    }
}
