




public class Nurse extends Employee { //Represents a nurse working inside the hospital.
    
    protected String shift;//which shift the nurse works (morning, evening, night)
    
    
    public Nurse(String name, int id, double salary, String shift) {
        super(name, id, salary);
        this.shift = shift;
              
    }
    
    public void displayInfo(){ super.displayInfo(); System.out.println(" shift: "+shift);}
}
