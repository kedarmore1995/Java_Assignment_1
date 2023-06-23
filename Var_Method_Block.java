package com.java;

//1.6 Write a program to demonstrate static variables, methods, and blocks.
public class Var_Method_Block {
    // Initializing static variables
    static int x=7;
    static int y;

    // Initializing static method
    static void func(int z) {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
    static {
        System.out.println("Running static initialization block.");
        y = x + 5;
    }
    public static void main(String[] args) {
        func(8);
    }
}
