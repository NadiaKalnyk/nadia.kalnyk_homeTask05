package ua.hillel.homeTask_03;

public class Task04EquilateralTriangle {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 34;
        double side3 = 3;
        double sum1 = side2 + side1;
        double sum2 = side1 + side3;
        double sum3 = side1 + side2;

        if ((side1 < sum1) && (side2 < sum2) && (side3 < sum3)) {
            System.out.println("Triangle exist");
            if ((side1 == side2) && (side2 == side3)) {
                System.out.println("Equilateral triangle");
            } else {
                System.out.println("Not equilateral triangle");
            }
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }
}


