public class Hospital { // the main class that manages everything in the system

private Employee[] staff; // array of the employees in the hospital
private  Billable[] Billables; // array of the billable items( doctors and medicienes )
private int empCount; // counter for employees
private int billCount; // counter for billable items


public Hospital(int size) {

    staff = new Employee[size];
    Billables = new Billable[size];
    empCount = 0;
    billCount = 0;

}//Hospital

public boolean addEmployee(Employee e){

    if(empCount < staff.length ) { // check if there is place to add new object
        staff[empCount++] = e;     // aggregation
        return true;
    }
    return false;
}//addEmployee

public boolean removeEmployee(int id) {

    for( int i = 0; i < empCount; i++ ){
        if( staff[i].id == id){

            for(int j = i; j < empCount - 1; i++){ // remove by shifting
                staff[j] = staff[j + 1];
            }

            staff[empCount - 1 ] = null;
            empCount--;
            return true;
        }
        return false;
    }
}//removeEmployee

public Employee searchEmployee(int id) { // search by id

    for(int i = 0; i < empCount; i++) { 
        if(staff[i].id == id)
            return staff[i];
    }
    return null
}//searchEmployee

public boolean addBillable( Billable b) {

    if(billCount < Billables.length) {
        Billables[billCount++] = b;
        return true;
    }
return false;


}//addBillable

public double calculateTotalSalaryRec|(int index) { //recursively goes through the staff array and adds up all salaries

    if(index >= empCount){
        return 0;
    }
return staff[index].getSalary() + calculateTotalSalaryRec(index + 1);

}//calculateTotalSalaryRec

public double calculateTotalBills() {//goes through the billables array and adds up all costs

    double total = 0;
    for( int i = 0; i < billCount; i++) {
        total += Billables[i].calculateCost();
    }
return total;
}//calculateTotalBills
    
}