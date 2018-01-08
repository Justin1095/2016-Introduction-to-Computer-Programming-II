
/**
 * FullTimeEmployee
 * 
 * @author Justin Seda 
 * @version March 23, 2016 
 */
public class FullTimeEmployee extends Employee
{
    private double weeklySalary;
    
    //constructor   
    public FullTimeEmployee(String first, String last, String ssn, double salary)
    {
        super(first, last, ssn);
        weeklySalary = salary;
    }
    
    //weeklySalary accessor 
    public double getWeeklySalary()
    {
       return weeklySalary;
    }
    
    //weeklySalary mutator
    public void setWeeklySalary(double salary)
    {
        weeklySalary = salary;
    }
    
    //overriding 
    public double earnings()
    {
        return weeklySalary;
    } 
    
    public String toString() //returns the string to the super
    {
        String salary = String.format("%.2f", weeklySalary);
        return super.toString() + "\t$" +  salary;           
    }
}
