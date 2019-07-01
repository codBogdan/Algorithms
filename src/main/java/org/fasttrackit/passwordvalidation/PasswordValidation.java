package org.fasttrackit.passwordvalidation;

import java.util.Scanner;

public class PasswordValidation {

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int maxAttemps = 3;
        int attemps = 0;
        int a;

        while (attemps<maxAttemps) {
            System.out.println("What is the password?");
            a = input.nextInt();

            if (a == 1234) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("I don't know you.");
            }
            attemps++;
        }

        if (attemps == maxAttemps){
            System.out.println("\n" + "Try again later");
        }
    }

}
