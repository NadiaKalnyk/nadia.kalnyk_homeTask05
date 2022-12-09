package ua.hillel.Arrays;

import java.util.Arrays;

public class Arrays_For {
    public static void main(String[] args) {
        double[] nameArray = { 1.2, 3.4, 5.6 };

        nameArray[2]=9; // замінюємо у третьому елементі значення на 9

        for (int i=0; i<nameArray.length; i++) { // використовується для зчитування і записуваня даних в масив
            System.out.println(nameArray[i]);
        }
        System.out.println(Arrays.toString(nameArray));
    }
}
