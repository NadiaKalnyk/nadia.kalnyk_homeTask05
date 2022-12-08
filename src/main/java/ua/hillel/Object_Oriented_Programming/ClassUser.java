package ua.hillel.Object_Oriented_Programming;

public class ClassUser {
    String username = "default_username";
    String password = "1234";
    boolean isActive = false;

    public ClassUser() {
        System.out.println("Create user"); // конструктор, назва якого співпадає з назвою класу
    }

    public void loginToApp () {
        System.out.println("login to app with " + username + "and " + password);
    }

    public void canLogin() {
        if (isActive) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
