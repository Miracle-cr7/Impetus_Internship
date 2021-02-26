package Single_Inheritance;

abstract class Employee
{
    private String firstName;
    private String lastName;
    private String SSN;
    protected int p = 10;
    Employee(String fname, String lname, String ssn)
    {
        firstName = fname;
        lastName = lname;
        SSN = ssn;
    }
    
    public void setFirstName(String fname)
    {
        firstName = fname;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String lname)
    {
        lastName = lname;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setSSN(String ssn)
    {
        SSN = ssn;
    }
    
    public String getSSN()
    {
        return SSN;
    }
    
    abstract double earnings();
}