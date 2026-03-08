public class Reservation {
private String patientName;
private Doctor doctor; //doctor object
private String cAppointments;

public Reservation(String patientName, Doctor doctor, String cAppointments) {
this.patientName = patientName;
this.doctor = doctor;
this.cAppointments= cAppointments;
}
public void printReservation() {
System.out.println("----------- Reservation Info -----------");
System.out.println("Patient: " + patientName);
System.out.println("Doctor: Dr. " + doctor.getName());
System.out.println("Appointment Time: " + cAppointments );

System.out.println("Full Doctor Schedule: " + doctor.getSchedule().getDetails());
System.out.println("---------------------------------");
}
}



