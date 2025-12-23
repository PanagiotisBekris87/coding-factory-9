package gr.aueb.cf.cf9.ch17.enums;

public enum WeekDay {

    SUNDAY("Κυριακή"),
    MONDAY("Δευτέρα"),
    TUESDAY("Τρίτη"),
    WEDNESDAY("Τετάρτη"),
    THURSDAY("Πέμπτη"),
    FRIDAY("Παρασκευή"),
    SATURDAY("Σάββατο");             // σκέψου το σαν constructor - συσχετίζουμε με String
                                    // Τα ordinals παράμενουν , υφίστανται

    private String day;

    WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
