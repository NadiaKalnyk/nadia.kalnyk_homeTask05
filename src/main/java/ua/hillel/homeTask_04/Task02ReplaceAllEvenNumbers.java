package ua.hillel.homeTask_04;

import java.util.Arrays;
import java.util.Random;

public class Task02ReplaceAllEvenNumbers {
    public static void main(String[] args) {
        int[] ranArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = random.nextInt(100); // запис рандомних чисел в масив
        }
        System.out.println(Arrays.toString(ranArray));
        for (int i = 0; i < ranArray.length; i++) {
            if (ranArray[i] % 2 == 0) {
                ranArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ranArray));
    }
}
