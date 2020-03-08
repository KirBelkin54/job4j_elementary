package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = ((height-100)*1.15);
        return rsl;
    }

    public static double womanWeight(double height) {
        double rs2 = ((height-110)*1.15);
        return rs2;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        System.out.println("Man 100 is " + man);
        double woman = Fit.womanWeight(180);
        System.out.println("Woman 100 is " + woman);
    }
}