package ua.hillel.Arrays;

import java.util.Arrays;

public class Array_ForEach {
    public static void main(String[] args) {
        double[] nameArray = { 1.2, 3.4, 5.6 };

        nameArray[2]=9;
        for (double d : nameArray) { // використовується для зчитування. не може змінити значення всередині масиву
            d = d +5;
            System.out.println(d);
        }
        System.out.println(Arrays.toString(nameArray));
    }
}
