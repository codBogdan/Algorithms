package org.fasttrackit.merrychristmas;

public class Tree {
    public void make() throws InterruptedException {
        for(int i=0; i<9; i++){
            System.out.println();
            for(int j=9; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
                Thread.sleep(200);
            }
        }
        System.out.println("\n         ||\n         ||");
        Thread.sleep(200);
    }
}
