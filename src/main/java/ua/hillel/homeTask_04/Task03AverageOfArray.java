package ua.hillel.homeTask_04;

import java.util.Arrays;
import java.util.Random;

public class Task03AverageOfArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ranArray = new int[20];
        double average;

        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ranArray));

        double sum = 0;
        for (int i = 0; i < ranArray.length; i++) {
            sum += ranArray[i];
        }
        average = sum / 20;
        System.out.println("Average of elements in array is " + average);
    }
}




