package ua.hillel.HomeTask_02;

import java.util.Scanner;

public class Task03AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter circle radius: ");
        double CircleRadius = scanner.nextDouble();

        double AreaCircle = 3.14*Math.pow(CircleRadius, 2);

        System.out.println("Area of circle: "+AreaCircle);

    }
}
