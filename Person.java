


public abstract class Person { //The base class for everyone in the system.

    protected String name;//the person's name
    protected int id;//unique identifier for the person

    public Person(String name, int id){ this.name = name; this.id = id; }
    public abstract void displayInfo();//abstract method that forces every subclass to provide its own way of displaying information
}//end person
