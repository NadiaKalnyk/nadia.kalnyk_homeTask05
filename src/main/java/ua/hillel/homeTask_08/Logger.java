package ua.hillel.homeTask_08;

public class Logger {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());

    public static void info (String value) {
        System.out.println(ColorForText.GREEN_BOLD_BRIGHT + value);
    }

    public static void debug (String string) {
        System.out.println(ColorForText.WHITE_BOLD_BRIGHT + string);
    }

    public static void warn (String string) {
        System.out.println(ColorForText.YELLOW_BOLD_BRIGHT + string);
    }

    public static void error (String string) {
        System.out.println(ColorForText.RED_BOLD_BRIGHT + string);
    }
}
