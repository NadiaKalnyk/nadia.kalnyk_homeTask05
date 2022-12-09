package ua.hillel.Loops;

public class While {
    public static void main(String[] args) {
        int count =0;
        boolean flag=true; //change on the 'false' (loop will not do any 1 time)

        while (flag){
            System.out.println(count);
            if (count > 5) {
                break;
            }
            count++;
        }
    }
}
