package com.java;

public class LeapYear {
    public static void main(String[] args) {
        int year=Integer.parseInt(args[0]);
        boolean leap=false;
        if(year<1582){
            throw new ArithmeticException("Try Again - year above or equal 1582 is accepted.");
        }
        {
            if(year%4==0) {
                leap = true;
                {
                    if (year % 400 == 0)
                        leap = true;
                    {
                        if (year % 100 == 0)
                            leap = true;
                    }
                }
            }
            else
                leap = false;
        }
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        }
    }

