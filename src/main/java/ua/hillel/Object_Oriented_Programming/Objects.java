package ua.hillel.Object_Oriented_Programming;

public class Objects {
    public static void main(String[] args) {
        ClassUser user1 = new ClassUser();
        user1.username = "user1@mail.com";
        user1.password = "password1";
        user1.isActive = true;

        ClassUser user2 = new ClassUser ();
        user2.username = "user2@mail.com";
        user2.password = "password2";
        user2.isActive = false;

        user1.canLogin();
        user2.canLogin();

        user1.loginToApp();
        user2.loginToApp();
    }
}
