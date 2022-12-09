package ua.hillel.homeTask_08;


public class MainClass {
    public static void main(String[] args) {
        Logger.info(Enum.INFO.getMessage());
        Logger.debug(Enum.DEBUG.getMessage());
        Logger.warn(Enum.WARN.getMessage());
        Logger.error(Enum.ERROR.getMessage());
    }
}
