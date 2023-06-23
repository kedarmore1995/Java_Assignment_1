package com.java;

//1.2 Write a Java program to display the default value of all primitive data types of Java

public class Data_type {
    public static void main(String[] args) {
        int value = 20;
        System.out.println("Integer value is: " + value);

        double salary = 5000.560;
        System.out.println("Double value is: " + salary);

        byte age = 15;
        System.out.println("Byte value is: " + age);

        char grade = 'A';
        System.out.println("Char value is: " + grade);

        String name = "Kedar";
        System.out.println("String value is: " + name);

        long number = 98756309;
        System.out.println("Long value is: " + number);

        float num = 673465.65f;
        System.out.println("Float value is: " + num);

        boolean flag = true;
        System.out.println("Boolean value is: " + flag);

        boolean hasPermission = true;
        if (hasPermission) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Granted");
        }
    }
}
