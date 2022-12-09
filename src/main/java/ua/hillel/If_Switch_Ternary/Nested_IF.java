package ua.hillel.If_Switch_Ternary;

public class Nested_IF {
    public static void main(String[] args) {
        boolean b1=true, b2=false, b3=true;
        System.out.println("after IF");
        if (b1) {
            System.out.println ("statement1");
            if (b2) {
                System.out.println ("statement2");
                if (b3) {
                    System.out.println("statement3");
                }
             } else {
                System.out.println("else 2");
            }
         }
    }
}
