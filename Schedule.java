

public class Schedule {//Represents a doctor's work schedule. Owned entirely by a Doctor (Composition).
    private String days;//days of work
    private String hours;//hours of work

    public Schedule(String days, String hours) {

        this.days = days;
        this.hours = hours;
    }

    public String getDetails() {//returns a formatted string of the days and hours
        return "Days of work: " + days + ", Hours of work: " + hours;
    }
}


