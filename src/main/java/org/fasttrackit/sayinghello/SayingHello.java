package org.fasttrackit.sayinghello;

import java.util.Scanner;

public class SayingHello {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String a = input.next();

        System.out.println();
        System.out.println("Hello, " + a + " , nice to meet you!");
    }
}
