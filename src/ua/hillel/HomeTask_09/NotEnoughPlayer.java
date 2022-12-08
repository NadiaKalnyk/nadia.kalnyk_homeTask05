package ua.hillel.HomeTask_09;

public class NotEnoughPlayer extends Throwable {
    public NotEnoughPlayer (String nep) {
        super("Player should be from 2 to 8" + nep);
    }
}
