package ua.hillel.homeTask_09;

public class NotFullDeckException extends Throwable {
    public NotFullDeckException(String nfd) {
        super(nfd);
    }
}
