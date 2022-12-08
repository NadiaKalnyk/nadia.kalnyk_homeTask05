package ua.hillel.Loops;

public class Continue_LoopControl {
    public static void main(String[] args) {
        for (int i=2; i > -3; i --) {
            if (i == 0) {
                continue;
            }
            System.out.println(5/i);
        }
    }
}
