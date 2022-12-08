package ua.hillel.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5]; // оголошення масиву примітивних типів з 5 впорядкованих елем
        System.out.println(Arrays.toString(intArray));

        String[] strArray = new String[5];
        System.out.println(Arrays.toString(strArray)); // оголошення масиву для типів за посиланням

        double[] nameArray = {1.2, 3.4, 5.6}; // оголошення масиву, коли елем вводимо вручну
        System.out.println(Arrays.toString(nameArray));

        nameArray[2] = 9; // замінюємо у третьому елементі значення на 9
        System.out.println(Arrays.toString(nameArray));
    }
}
