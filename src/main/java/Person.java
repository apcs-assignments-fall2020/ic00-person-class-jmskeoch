public class Person {
    //Instance vars
    public String firstName;
    public String lastName;

    //Constructor
    public Person(String firstName, String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Non-static method
    public String doSomething() 
    {
        String activity = "watching Netflix";
        return "I am " + activity;
    }

    //To String method
    @Override
    public String toString() 
    {
        return "My name is " + this.firstName + " " + this.lastName + "!";
    }
    

}













