package ua.hillel.homeTask_09;

public class NotEnoughPlayerException extends Throwable {
    public NotEnoughPlayerException(String nep) {
        super(nep);
    }
}
