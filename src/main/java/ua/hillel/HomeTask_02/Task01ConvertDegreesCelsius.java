package ua.hillel.HomeTask_02;

import java.util.Scanner;

public class Task01ConvertDegreesCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degree Celsius: ");
        double DegreeCelsius = scanner.nextDouble();

        double Fahrenheit = (9*DegreeCelsius+160)/5;
        double Kelvin = (DegreeCelsius+273.16);

        System.out.println(DegreeCelsius+"C: "+Fahrenheit+"F, "+Kelvin+"K");
    }
}
