



public class Medicine implements Billable { //Represents a medicine available in the hospital.

    private String name;//name of the medicine
    private double price;//cost of the medicine

    public Medicine(String name, double price){ 
    this.name = name;
    this.price = price;
    }
    
    public double calculateCost() { return price; }
    
}
