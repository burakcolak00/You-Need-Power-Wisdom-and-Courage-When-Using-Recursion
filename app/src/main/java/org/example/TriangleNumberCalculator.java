package org.example;

import java.util.ArrayList;

public class TriangleNumberCalculator {
    ArrayList<Integer> triangleNumbers = new ArrayList<>();

    public TriangleNumberCalculator(){
        triangleNumbers.add(0);
        triangleNumbers.add(1);
    }

    public int value(int n){
        if (n <= 0) {
            System.out.println("You must enter a positive integer.");
            return -1; 
        }

        if (n == 1) {
            return 1;
        }

        if (triangleNumbers.size() > n) {
            return triangleNumbers.get(n);
        }

        triangleNumbers.add(n + value(n - 1));
        return triangleNumbers.get(n);
    }

    public int add(int n, int m) {
        if (n < 0 || m < 0) {
            System.out.println("You must enter positive integers.");
            return -1;
        }
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        if (n < 0 || m < 0) {
            System.out.println("You must enter positive integers.");
            return -1;
        }
        return value(n) - value(m);
    }

    public int multiply(int n, int m) {
        if (n < 0 || m < 0) {
            System.out.println("You must enter positive integers.");
            return -1;
        }
        return value(n) * value(m);
    }

    public double divide(int n, int m) {
        if (n < 0 || m <= 0) {
            System.out.println("You must enter positive integers, and the second number must not be zero.");
            return -1;
        }
        return value(n) / value(m);
    }

    public void sequence(int n) {
        if (n < 0) {
            System.out.println("You must enter a positive integer.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(value(i) + " ");
        }
        System.out.println();
    }
}
