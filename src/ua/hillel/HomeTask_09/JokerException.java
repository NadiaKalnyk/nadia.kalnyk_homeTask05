package ua.hillel.HomeTask_09;

public class JokerException extends Throwable {
    public JokerException(String joker) {
        super("Can't use" + joker);
    }
}
