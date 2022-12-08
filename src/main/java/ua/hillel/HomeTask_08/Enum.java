package ua.hillel.HomeTask_08;

public enum Enum {
    INFO ("Information: intended to promote understanding, encourage action, stimulate thinking, or promote ideas"),
    DEBUG("Debugging: intended to help diagnose problems and/or help Moodle developers"),
    WARN("Warning: advanced notice of a potential change that may result in loss of data or an error state"),
    ERROR("Error: displayed when an unforeseen problem occurs");
    private final String message;

    public String getMessage;

    Enum(String message) {
        this.message = message;
    } // конструктор?

    public String getMessage() {
        return message;
    }
}

