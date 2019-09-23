package org.fasttrackit.merrychristmas;

public class Santa {
    public void laugh() throws InterruptedException {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ho! ");
            Thread.sleep(500);
        }
    }

    public void speak() {
        System.out.println("Merry Christmas and happy new year!");
    }
}

