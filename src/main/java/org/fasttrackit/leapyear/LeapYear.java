package org.fasttrackit.leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main (String args[]){
        int year;
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year!");
        else
            System.out.println("Specified year is not a leap year");
    }
}
//Finding a year is a leap or not is a bit tricky. We generally assume that if a year number
// is evenly divisible by 4 is a leap year. But it is not the only case.
// A year is a leap year if −
//1. It is evenly divisible by 100
//2. If it is divisible by 100, then it should also be divisible by 400
//3. Except this, all other years evenly divisible by 4 are leap years.