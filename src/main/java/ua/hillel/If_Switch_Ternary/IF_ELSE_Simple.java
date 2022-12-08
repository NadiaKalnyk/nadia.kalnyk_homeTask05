package ua.hillel.If_Switch_Ternary;

public class IF_ELSE_Simple {
    public static void main(String[] args) {
        System.out.println("before IF");

        if (true) { //якщо умова true - заходимо в середину оператора if, якщо false - не зах всередину(виконується 10)
            System.out.println("Inside IF");
        } else {
            System.out.println("before else");
        }
        System.out.println("After IF");
    }
}
