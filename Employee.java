public class Employee extends Person {//Represents any employee working at the hospital.

    protected double salary;//the employee's monthly salary
    
    
    public Employee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    
    public void displayInfo() 
    { System.out.println("Name: " + name);
      System.out.println("ID: " + id);
      System.out.println("Salary: " + salary);}
    
    public double getSalary(){ return salary; } //return salary
    
    public String getName() {
    return name; 
    } 
}