package ua.hillel.homeTask_02;

import java.util.Scanner;

public class Task02AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        double area = (width * height) / 2;
        System.out.println("Area of triangle: " + area);
    }
}
