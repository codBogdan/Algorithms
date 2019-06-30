package org.fasttrackit.bloodalcoholcalculator;

public class BloodAlcoholCalculator {
    private double totalAlcohol;
    private int weight;
    private double r;
    private int h;





    public double getTotalAlcohol() {
        return totalAlcohol;
    }

    public void setTotalAlcohol(double totalAlcohol) {
        this.totalAlcohol = totalAlcohol;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public BloodAlcoholCalculator(int totalAlcohol, int weight, double r, int h) {
        this.totalAlcohol = totalAlcohol;
        this.weight = weight;
        this.r = r;
        this.h = h;
    }


    @Override
    public String toString() {
        return "BloodAlcoholCalculator{" +
                "totalAlcohol=" + totalAlcohol +
                ", weight=" + weight +
                ", r=" + r +
                ", h=" + h +
                '}';
    }
}
