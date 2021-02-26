package Single_Inheritance;

class SalariedEmployee extends Employee
{
    private double weeklySalary;
    SalariedEmployee(String fname, String lname, String ssn, double sal)
    {
        super(fname, lname, ssn);
        weeklySalary = sal;
        p = 15;
    }
    
    public void setWeeklySalary(double sal)
    {
        weeklySalary = sal;
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    public double earnings()
    {
        return weeklySalary;
    }
    
}
