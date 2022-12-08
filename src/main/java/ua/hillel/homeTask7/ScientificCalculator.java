package ua.hillel.homeTask7;

    public class ScientificCalculator extends BasisCalculator{
        double number1;
        double number2;

        public static void getSum(double number1, double number2) {
            double sum = number1+ number2;
            System.out.println("Scientific Sum= " + sum);
        }

        public static void getDifference(double number1, double number2) {
            double diff = number1-number2;
            System.out.println("Scientific Difference= " + diff);
        }

        public static void getMultiplication(double number1, double number2) {
            double multiplication = number1*number2;
            System.out.println("Scientific Multiplication= " + multiplication);
        }
        public static void getDivision(double number1, double number2) {
            if (number2 == 0) {
                System.out.println("ERROR.Division by zero");
            } else {
                double division = (number1 /number2)+(number1 %number2);
                System.out.println("Scientific Division= " + division);
            }
        }
        @Override
        public void getRoot(double number1, double number2) {
            double root = Math.cbrt(number1);
            System.out.println("Scientific cbrtRoot: " + number1 + "= " + root + "," + number2 + " - if you want to know root of this number you need to enter it first");
        }

        @Override
        public void getExponentiation(double number1, double number2) {
            double exponent = Math.pow(number1, 3);
            System.out.println("Scientific Exponentiation:  " + number1 + "= " + exponent + ", " + number2 + " - if you want to put of this number to cube you need to enter it first");
        }
        public static void getAbs(double number1, double number2) {
            double abs = Math.abs(number1);
            System.out.println("Scientific abs:  " + "|" + number1 +"|"+ "= " + abs + ", " + number2 + " - if you want abs of this number you need to enter it first");
        }
    }

