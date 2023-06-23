package com.java;

//1.4 To find the sum of command-line arguments and count the invalid integers entered.
public class CommandLineArgs {
    public static void main(String[] args) {
        int counter = 0;
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Sum is " + sum);
        }catch(NumberFormatException e){
            counter = counter + 1;
        }
            System.out.println("Please provide valid integers");
            System.out.println("Count of invalid integer="+ counter);
    }
}
