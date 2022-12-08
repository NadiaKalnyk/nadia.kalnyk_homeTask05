package ua.hillel.HomeTask_09;

public class NotFullDeckException extends Throwable {
    public NotFullDeckException(String nfd) {
        super(nfd);
    }
}
