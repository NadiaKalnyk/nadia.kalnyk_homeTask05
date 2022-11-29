package ua.hillel.HomeTask_07;

public class ScientificCalculator extends BasisCalculator{

    public static void getSum(double number1, double number2) {
        System.out.println(number1+number2);
    }

    public static void getDifference(double number1, double number2) {
        System.out.println(number1-number2);
    }

    public static void getMultiplication(double number1, double number2) {
        System.out.println(number1*number2);
    }
    public static void getDivision(String str, double number1, double number2) {
        if (number2 == 0) {
            System.out.println("error.Division by zero" + str);
        } else {
            System.out.println(number1 / number2);
        }
    }

    @Override
    public static void getRoot(double number1) {
        System.out.println(Math.sqrt(number1));
    }

    @Override
    public static void getExponentiation(double number1) {
        System.out.println(Math.pow(number1, 2));
    }
}