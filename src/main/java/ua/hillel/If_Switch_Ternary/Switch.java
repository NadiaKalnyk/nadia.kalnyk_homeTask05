package ua.hillel.If_Switch_Ternary;

public class Switch {
    public static void main(String[] args) {
        int dayOffWeek =3;

        switch (dayOffWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("holiday");
                break;
            default:
                System.out.println("Wrong number of day");
        }
    }
}
