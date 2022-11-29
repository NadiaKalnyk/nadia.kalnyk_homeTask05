package ua.hillel.HomeTask_07;

import java.util.Scanner;

import static ua.hillel.HomeTask_07.BasisCalculator.*;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Enter number1: ");
        String number1 = new Scanner(System.in).next();

        System.out.println("Enter number2 or enter 0 if number2 is not need");
        String number2 = new Scanner(System.in).next();

        System.out.println("Enter one of the calculator function: +, -, *, /, ^, sqr, abs");
        String function = new Scanner(System.in).next();

        BasisCalculator basis = new BasisCalculator();
        basis.number1 = Integer.parseInt(number1);
        basis.number2 = Integer.parseInt(number2);

        ScientificCalculator scientific = new ScientificCalculator();
        scientific.number1 = Double.parseDouble(String.valueOf(number1));
        scientific.number2 = Double.parseDouble(number2);

        switch (function) {
            case "+":
                BasisCalculator.getSum(basis.number1, basis.number2);
                ScientificCalculator.getSum(scientific.number1, scientific.number2);
                break;
            case "-":
                BasisCalculator.getDifference(basis.number1, basis.number2);
                ScientificCalculator.getDifference(scientific.number1, scientific.number2);
                break;
            case "*":
                BasisCalculator.getMultiplication(basis.number1, basis.number2);
                ScientificCalculator.getMultiplication(scientific.number1, scientific.number2);
                ;
                break;
            case "^":
                basis.getExponentiation(basis.number1, basis.number2);
                scientific.getExponentiation(scientific.number1, scientific.number2);
                break;
            case "sqr":
                basis.getRoot(basis.number1, basis.number2);
                scientific.getRoot(scientific.number1, scientific.number2);
                break;
            case "/":
                BasisCalculator.getDivision(basis.number1, basis.number2);
                ScientificCalculator.getDivision(scientific.number1, scientific.number2);
                break;
            case "abs":
                ScientificCalculator.getAbs(scientific.number1, scientific.number2);
            default:
                System.out.println("please take another calculator:) ");
        }
    }
}
