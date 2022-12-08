package ua.hillel.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Array_sorting {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        boolean needSorting = true; // задано умову, що перестановка в масиві потрібна
        while (needSorting) {
            needSorting= false;

            for (int i = 0; i < array.length - 1; i++) { //length-1, щоб не вийти за межі масиву
                if (array[i]>array[i+1]) { // > за зростанням, < за спаданнямю не може бути <=/>= бо ми залишимося на одному мсці і будемо завджи міняти 2 елем місцями
                    int newValue = array[i];
                    array[i]=array[i+1];
                    array[i]= newValue;
                    needSorting=true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
