package ua.hillel.HomeTask_07;

import java.util.Scanner;

import static java.lang.String.*;
import static ua.hillel.HomeTask_07.BasisCalculator.*;

public class MainClass {
    public static void main(String[] args) {
/*
        System.out.println("Enter number1: ");
        String number1 = new Scanner(System.in).next();

        System.out.println("Enter number2 or enter 0 if number2 is not need");
        String number2 = new Scanner(System.in).next();

        System.out.println("Enter one of the calculator function: +, -, *, /, ^, sqr, abs");
        String function = new Scanner(System.in).next();
*/
        String function = "sqr";
        Double number1 = Double.valueOf(valueOf(3.5));
        Double number2 = Double.valueOf(valueOf(1.2));

        BasisCalculator basis = new BasisCalculator();
        basis.number1 = (int) number1.doubleValue();
        basis.number2 = (int) number2.doubleValue();

        ScientificCalculator scientific = new ScientificCalculator();
        scientific.number1 = Double.parseDouble(valueOf(number1));
        scientific.number2 = Double.parseDouble(valueOf(number2));

        switch (function) {
            case "+":
                ScientificCalculator.getSum(scientific.number1, scientific.number2);
                BasisCalculator.getSum(basis.number1, basis.number2);
                break;
            case "-":
                ScientificCalculator.getDifference(scientific.number1, scientific.number2);
                BasisCalculator.getDifference(basis.number1, basis.number2);
                break;
            case "*":
                ScientificCalculator.getMultiplication(scientific.number1, scientific.number2);
                BasisCalculator.getMultiplication(basis.number1, basis.number2);
                ;
                break;
            case "^":
                scientific.getExponentiation(scientific.number1, scientific.number2);
                basis.getExponentiation(basis.number1, basis.number2);
                break;
            case "sqr":
                scientific.getRoot(scientific.number1, scientific.number2);
                basis.getRoot(basis.number1, basis.number2);
                break;
            case "/":
                ScientificCalculator.getDivision(scientific.number1, scientific.number2);
                BasisCalculator.getDivision(basis.number1, basis.number2);
                break;
            case "abs":
                ScientificCalculator.getAbs(scientific.number1, scientific.number2);
            default:
                System.out.println("please take another calculator:) ");
        }
    }
}
