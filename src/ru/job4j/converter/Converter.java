package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rs2 = value / 60; // формула перевода рублей в доллоры.
        return rs2;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        //тест
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

    //тест
    int in2 = 140;
    int expected2 = 2;
    int out2 = rubleToDollar(in2);
    boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);
}
}