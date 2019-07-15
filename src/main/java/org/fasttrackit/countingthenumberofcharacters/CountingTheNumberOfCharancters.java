package org.fasttrackit.countingthenumberofcharacters;

import java.util.Scanner;

public class CountingTheNumberOfCharancters {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");
        String a = input.next();

        String name = new String (a);


        System.out.println(a + " has " + name.length() + " characters.");


    }
}
