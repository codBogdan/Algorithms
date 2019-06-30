package org.fasttrackit.bloodalcoholcalculator;

public class Main {


    public static void main (String args[]){

        System.out.println("-------- For men ---------");
        BloodAlcoholCalculator a =new BloodAlcoholCalculator(30, 77, 0.73, 5);
        System.out.println("Your blood alcohol : " + (((30*5.14)/(77*0.73))-(0.15*5)));

        System.out.println("\n" + "-------- For women ---------");
        BloodAlcoholCalculator b = new BloodAlcoholCalculator(14, 59, 0.66, 12);
        System.out.println("Your blood alcohol : " + (((14*5.14)/(59*0.66))-(0.15*12)));

        System.out.println("\n" + "------------Your result------------");

       double M = (((30*5.14)/(77*0.73))-(0.15*5));
       double W = (((14*5.14)/(59*0.66))-(0.15*12));

        if (M > 0.73) {
            System.out.println("Men : " + "It is not legal for you to drive!");
        } else {
            System.out.println("Men : " + "You are OK, you can drive. Be careful");
        }
        if (W > 0.66) {
            System.out.println("\n" + "Women : " + "Don't drive please!");
        } else {
            System.out.println("\n" + "Women : " + "It's OK, be careful!");
        }
        return;
    }
}

