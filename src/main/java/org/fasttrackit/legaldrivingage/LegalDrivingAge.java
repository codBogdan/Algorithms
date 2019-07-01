package org.fasttrackit.legaldrivingage;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int a = 16;


        System.out.println("What is your age? ");
        a = input.nextInt();


        if (a < 16){
            System.out.println("\n" + "You are not old enough to legally drive.");
        }else {
            if(a < 60 && a > 16){
                System.out.println("\n" + "You are old enough to legally drive.");

            }else{
                System.out.println("\n" + "STOP! Drive safely!");
            }
        }

    }

}
