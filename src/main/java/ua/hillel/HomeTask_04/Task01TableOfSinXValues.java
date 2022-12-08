package ua.hillel.HomeTask_04;

public class Task01TableOfSinXValues {
    public static void main(String[] args) {
        int i=0;
        while (i<=360){
            System.out.println("Sin(" + i+ ")= " + Math.sin(i));
            if (i>360) {
                break;
            }
            i += 10;
        }
    }
}
