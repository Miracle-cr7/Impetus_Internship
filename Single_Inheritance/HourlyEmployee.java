package Single_Inheritance;

class HourlyEmployee extends Employee
{
    private double wages;
    private double hours;
    
    HourlyEmployee(String fname, String lname, String ssn, double sal, double w, double h)
    {
        super(fname, lname, ssn);
        wages = w;
        hours = h;
    }
    
    public double getWages()
    {
        return wages;
    }
    
    public void setWages(double w)
    {
        wages = w;
    }
    
    public double getHours()
    {
        return hours;
    }
    
    public void setHours(double h)
    {
        hours = h;
    }
    
    public double earnings()
    {
        double sal;
        if(hours <= 40)
        {
            sal = wages * hours;
        }
        else
        {
            sal = 40 * wages + (hours - 40) * wages * 1.5;
        }
        return sal;
    }
}
