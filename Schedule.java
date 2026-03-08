public class Schedule {//Represents a doctor's work schedule. Owned entirely by a Doctor (Composition).
    private String[] days;//days of work
    private String[] appointments;//list of all available appointments 

    public Schedule(String[] days, String[] appointments) {

        this.days = days;
        this.appointments = appointments;
    }
    
     public void displayday() { //to display appoitments to choose
     System.out.println("Available Days: ");
     for (int i=0 ; i< days.length; i++) {
     System.out.println((i+1) + "- " + days[i]);
     }
     }
     
     public void displayapp() { //to display appoitments to choose
     System.out.println("Available Appoitments: ");
     for (int i=0 ; i< appointments.length; i++) {
     System.out.println((i+1) + "- " + appointments[i]);
     }
     }
     
     
    public String getDetails() {//returns a formatted string of the days and hours
    String d = " ";
    for (int i = 0; i<days.length; i++) {
    d += days[i] + (i == days.length - 1 ? " " : ", ");
    }
    String all = " ";
    for (int i = 0; i<appointments.length; i++) {
    all+= appointments[i] + (i == appointments.length - 1 ? " " : ", ");
    }
    return "Working Days: [ " + d + "] " + ", All Available appointments : [ " + all + "] ";
   }


public String getDayByChoice(int choice) {  
if(choice > 0 && choice <= days.length) {
return
days[choice - 1]; }
return null;
 }
 
 
public String getAppByChoice(int choice) {  
if(choice > 0 && choice <= appointments.length) {
return
appointments[choice - 1]; }
return null;
 }
}

