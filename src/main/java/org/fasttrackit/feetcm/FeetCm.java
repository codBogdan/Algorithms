package org.fasttrackit.feetcm;

import java.util.Scanner;

public class FeetCm {
    public static void main (String[] args){
        double feet;
        double meter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of feet: ");
        feet = sc.nextDouble();
        meter = feet * 0.305;

        System.out.println(feet + " is " + meter + " meters ");
    }
}

//Write a program that reads a number in feet, converts in to meters, and displays the result.