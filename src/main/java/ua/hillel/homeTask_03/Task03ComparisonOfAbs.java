package ua.hillel.homeTask_03;

public class Task03ComparisonOfAbs {
    public static void main(String[] args) {
        double number1 = -8.1;
        double number2 = 2;
        if (Math.abs(number1)>Math.abs(number2)) {
            System.out.println("Max absolute value of "+number1+" more than "+number2);
        } else if (Math.abs(number1)<Math.abs(number2)) {
            System.out.println("Max absolute value of " + number2 + " more than " + number1);
        } else {
            System.out.println("Max absolute values of " + number2 + " and " + number1 + " are the same");
        }
    }
}
