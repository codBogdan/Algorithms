package org.fasttrackit.passwordvalidation;

import java.util.Scanner;

public class PasswordValidation {

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.println("What is the password?");
        a = input.nextInt();

        if (a == 1234) {
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }

    }

}
