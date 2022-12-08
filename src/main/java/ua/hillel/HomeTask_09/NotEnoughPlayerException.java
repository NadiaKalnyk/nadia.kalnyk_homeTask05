package ua.hillel.HomeTask_09;

public class NotEnoughPlayerException extends Throwable {
    public NotEnoughPlayerException(String nep) {
        super(nep);
    }
}
