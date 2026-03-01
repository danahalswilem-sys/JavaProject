
import java.util.Scanner;

public class HospitalTest {
   static Scanner input = new Scanner(System.in);
   static Hospital hosp = new Hospital(100); //Hospital object with a capacity of 100

   public static void main(String [] args) {
      int ch;
      do{
         displayMenu(); //display all options to user
      
         System.out.println("Enter your choice: ");
      
      
         ch = input.nextInt(); 
      
         switch(ch) {
            case 1 : 
               addNewEmployee(); //to add differnt types of employees
               break;
         
            case 2: //remove employee object by ID
               System.out.println("Enter Employee ID to remove: ");
               int removebyid = input.nextInt();
               if (hosp.removeEmployee(removebyid))
                  System.out.println(" Employee removed successfully ");  
               else
                  System.out.println("Employee not found");
               break;
         
            case 3 : //search employee object by ID
               System.out.println("Enter Employee ID to search:");
               int searchbyid = input.nextInt();
               Employee emp = hosp.searchEmployee(searchbyid);
               if (emp != null) //check object is not null before displaying
                  emp.displayInfo();
               else
                  System.out.println(" Employee not found ");  
               break;
         
            case 4: //list all registerd employees
               System.out.println(" List of all employees:  "); 
               hosp.displayAllEmployee();
               break;
         
            case 5 : //to add billable medicine items
            String ans; 
            do{
            System.out.println(" Enter medicine name: "); 
           String medname = input.next();
           System.out.println( "Enter price: "); 
          double price = input.nextDouble();
          Medicine med = new Medicine(medname , price); //create medicine object and add to the billables array
          hosp.addBillable(med);
          System.out.println(" Medicine added successfully"); 
          System.out.println( "Do you want to add more? (y/n)"); 
            ans = input.next();
           } while (ans.equalsIgnoreCase("y"));
             
               break;
         
            case 6: //to show total bills
               System.out.println(" Total bills: " + hosp.calculateTotalBills()); 
               break;
         
         
            case 7:
 double totalSalaries = hosp.calculateTotalSalaryRec(0); //call the recursive methode start from the first employee (index 0) 
  System.out.println("Total Salaries Of All Employees:" + totalSalaries + "SAR");//final result of salaries summed together 
               break;
         
         
            case 8: //exit the loop
               System.out.println(" The System has reached an end"); 
               break;
         
            default:
               System.out.println("Invaild input, try again "); 
         }
      } while (ch != 8);
   }
 
    
   public static void displayMenu() {
      System.out.println("\n======= Hospital Management System Menu =======");
      System.out.println("1- Add a New Employee(Doctor, Nurse or HomeNurse)");
      System.out.println("2- Remove an Existing Employee by ID");
      System.out.println("3- Search for an Employee by ID");
      System.out.println("4- Display All Registered employees");
      System.out.println("5- Add a new Medicine");
      System.out.println("6- Display Total Bills");
      System.out.println ("7- Display Total Salary");
      System.out.println("8- Exit System");
   }

   public static void addNewEmployee() {
      { //adding differnt types
         System.out.println("Choose an Employee to add: ");
         System.out.println("1- Doctor");
         System.out.println("2- Nurse");
         System.out.println("3- Home Nurse");
         int type = input.nextInt();
      
         System.out.println("Enter ID:");
         int id = input.nextInt();
         System.out.println("Enter Name: ");
         String name = input.next();
         System.out.println("Enter Salary: ");
         double salary = input.nextDouble();
      
         switch(type) {
            case 1: //adding doctor
               System.out.println("Enter Specialization: ");
               String spec = input.next();
               System.out.println("Enter Work Days: (Sun-Thu)"); 
               String days = input.next();
               System.out.println("Enter Work Hours: (8am-4pm)"); 
               String hours = input.next();
               System.out.println("Enter Consultation Fee:");
               double consultationfe = input.nextDouble();
               Schedule sc = new Schedule(days, hours);
               Doctor d = new Doctor(name, id, salary, spec, sc, consultationfe);
               if (hosp.addEmployee(d))
                  hosp.addBillable(d);
               System.out.println("Doctor Added Sucssefully"); 
               break;
         
         
            case 2: //adding nurse
               System.out.println("Enter Shift: (morning or night) ");
               String shift = input.next();
               Nurse n = new Nurse(name, id, salary, shift);
               if (hosp.addEmployee(n))
                  System.out.println(" Nurse Added Sucssefully"); 
               break;
         
         
            case 3: //adding Home nurse
               System.out.println("Enter Shift: (morning or night) ");
               String hshift = input.next();
               System.out.println("Enter Patient Address");
               String address = input.next();
               HomeNurse hn = new HomeNurse(name, id, salary, hshift, address);
               if (hosp.addEmployee(hn))
                  System.out.println("Home Nurse Added Sucssefully"); 
               break;
         
            default:
               System.out.println("Invalid Type, try again"); //Returning to main menu
               break;
            
         }
      }
   }
}
