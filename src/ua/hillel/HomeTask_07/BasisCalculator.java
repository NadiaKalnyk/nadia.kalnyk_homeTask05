package ua.hillel.HomeTask_07;

public class BasisCalculator{

    public static void getSum(int number1, int number2) {
        System.out.println(number1+number2);
    }

    public static void getDifference(int number1, int number2) {
        System.out.println(number1-number2);
    }

    public static void getMultiplication(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public static void getDivision (String str, int number1, int number2) {
        if (number2 == 0) {
            System.out.println("error.Division by zero" + str);
        } else {
            System.out.println(number1/number2);
        }
    }

    public static void getRoot(double number1) {
        System.out.println(Math.sqrt(number1));
    }

    public static void getExponentiation(double number1) {
        System.out.println(Math.pow(number1, 2));
    }
/*
    public String getSum() {
        return getSum();
    }

    public String getDifference() {
        return getDifference();
    }

    public String getMultiplication() {
        return getMultiplication();
    }

    public String getDivision() {
        return getDivision();
    }

    public String getRoot() {
        return getRoot();
    }

    public String getExponentiation() {
        return getExponentiation();
    }
    */
}


