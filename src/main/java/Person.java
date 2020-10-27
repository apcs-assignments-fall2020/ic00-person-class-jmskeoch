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

    //getters
    public String getFirstName() 
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    //setters
    public void setFirstName(String f)
    {
        this.firstName = (f.trim().length() != 0) ? f : this.firstName;
    }

    public void setLastName(String l) 
    {
        this.lastName = (l.trim().length() != 0) ? l : this.lastName;
    }

    //To String method
    @Override
    public String toString() 
    {
        return "My name is " + this.firstName + " " + this.lastName + "!";
    }
    

}













