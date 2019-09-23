package org.fasttrackit.merrychristmas;

public class Christmas {
    public static void main (String[] args) throws InterruptedException {
        Santa s = new Santa();
        Tree t = new Tree();

        s.laugh();
        s.speak();
        t.make();
    }
}
