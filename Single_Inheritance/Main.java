package Single_Inheritance;

class Main
{
    public static void main(String[] args)
    {
        SalariedEmployee se = new SalariedEmployee("Tushar", "Dhakad", "#12345@", 100000000);
        HourlyEmployee he = new HourlyEmployee("Dhakad", "Tushar", "#54321@", 1000000, 100, 60);
        
        se.setWeeklySalary(2000000);
        System.out.println(se.getWeeklySalary());
        System.out.println(se.earnings());
        
        he.setWages(1200);
        System.out.println(he.getWages());
        
        he.setHours(12);
        System.out.println(he.getHours());
        
        System.out.println(he.earnings());
        
        System.out.println(se.p);
        
    }
}
