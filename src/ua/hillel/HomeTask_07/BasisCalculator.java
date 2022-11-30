package ua.hillel.HomeTask_07;

public class BasisCalculator{
int number1;
int number2;
    public static void getSum(int number1, int number2) {
        int sum = number1+number2;
        System.out.println("Basis Sum= " + sum + "P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
    }

    public static void getDifference(int number1, int number2) {
        int diff = number1-number2;
        System.out.println("Basis Difference= " + diff + "P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
    }

    public static void getMultiplication(int number1, int number2) {
        int multiplication = number1 * number2;
        System.out.println("Basis Multiplication= " + multiplication + "P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
    }
    public static void getDivision (int number1, int number2) {
        if (number2 == 0) {
            System.out.println("ERROR.Division by zero");
        } else {
            int division = (number1 /number2)+(number1 %number2);
            System.out.println("Basis Division= " + division + "P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
        }
    }

    public void getRoot(double number1, double number2) {
        if (number1>=0) {
        double root = Math.sqrt(number1);
        System.out.println("Basis sqrtRoot: " + number1 + "= " + root + ", " + number2 + " - if you want to know root of this number you need to enter it first");
        System.out.println("P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
        } else System.out.println("Basis sqrtRoot: ERROR" + number1 + "<0");
    }

    public void getExponentiation(double number1, double number2) {
        double exponent = Math.pow(number1, 2);
        System.out.println("BasisExponentiation= " + number1 + "= " + exponent + ", " + number2 + "if you want to put of this number to squared you need to enter it first");
        System.out.println("P.S: Basis works only with int numbers. If you enter fraction number - the fraction part isn't calculated :)");
    }
}


