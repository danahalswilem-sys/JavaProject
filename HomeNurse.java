


public class HomeNurse extends Nurse {//Represents a nurse that visits and takes care of patients at their homes.
    private String patientAddress;//the address of the patient they are assigned to

    
    public HomeNurse(String name, int id, double salary, String shift, String patientAddress) {
        super(name, id, salary, shift);
        this.patientAddress = patientAddress;
    }
    
    public void displayInfo(){ super.displayInfo(); System.out.println("patient address: "+patientAddress); }
    
}
