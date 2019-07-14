package org.fasttrackit.cozalozawoza;

public class cozalozawoza {

    public static void main(String args[]) {
//        int i = 1;
//
//        while (i <= 110) {
//            boolean test = false;
//            if (i % 3 == 0) {
//                System.out.println("Coza");
//                test = true;
//            }
//            if (i % 5 == 0) {
//                System.out.println("Loza");
//                test = true;
//            }
//            if (i % 7 == 0) {
//                System.out.println("Woza");
//                test = true;
//            }
//                if (i % 3 == 0 && i % 5 == 0){
//                    System.out.println("CozaLoza");
//                }
//            if (!test) {
//                System.out.println(i);
//            }
//            System.out.println(" ");
//
//            if (i % 11 == 0) {
//                System.out.println();
//            }
//            i++;
//        }


//
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("\t"+" CozaLoza ");
            } else {
                if (i % 5 == 0) {
                    System.out.print("\t"+" Loza ");
                } else if (i % 3 == 0) {
                    System.out.print("\t"+" Coza ");
                } else {
                    System.out.print("\t"+" " + i + " ");
                }
            }
            if (i % 11 == 0) {
                System.out.println("\t");
            }
        }
    }
}






