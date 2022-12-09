package ua.hillel.Arrays;

public class ArrayString_split {
    public static void main(String[] args) {
        String categories = "PC, Phone, Laptop, Notebook";

        String[] cats = categories.split(",");
        for (String category : cats) {
            System.out.println("Navigate to " + category + " and check product");
        }
    }
}
