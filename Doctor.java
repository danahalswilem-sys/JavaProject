public class Doctor extends Employee implements Billable { //Represents a doctor working at the hospital.
    
    private String specialization;//the doctor's medical field
    private Schedule schedule;//object representing when the doctor works
    private double consultationfee;//represent the fixed fee charged per consultation for this doctor

    public Doctor(String name, int id, double salary, String specialization, Schedule schedule, double consultationfee) {
        super(name, id, salary);
        this.specialization = specialization;
        this.schedule = schedule;
        this.consultationfee = consultationfee;
    }
    
  
    
    public void displayInfo() { super.displayInfo();
    System.out.println(" specialization: "+specialization);
    System.out.println(" Consultation Fee: " + consultationfee);
    System.out.println(" Doctor Schedule:" + schedule.getDetails());
    } 
    

    
    public double calculateCost() { //returns the cost of a doctor's service
        return consultationfee; // fixed consultation fee
        }
        
         public Schedule getSchedule() {
    return schedule; 
    }
       
          
    }