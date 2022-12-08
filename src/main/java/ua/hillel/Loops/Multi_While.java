package ua.hillel.Loops;

public class Multi_While {
    public static void main(String[] args) {
        int count = 0;
        int innerCount = 0;
        while (count < 5) {
            System.out.println(count);
            while (innerCount < 10) {
                System.out.println(innerCount);
                if (innerCount == 5) {
                    break;
                }
                innerCount ++;
            }
        count ++;
        }
    }
}
