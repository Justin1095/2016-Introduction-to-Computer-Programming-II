
/**
 * PartTimeEmployee
 * 
 * @author Justin Seda 
 * @version March 23, 2016
 */
public class PartTimeEmployee extends Employee 
{
    private double wage;
    private double hours;
    
    //constructor
    public PartTimeEmployee(String first, String last, String ssn, double hrs, double w)
    {
        super(first, last, ssn);
        hours = hrs;
        wage = w;
    }
    
    //hours accessor
    public double getHours()
    {
        return hours;
    }
    
    //wage accessor
    public double getWage()
    {
        return wage;
    }
    
    //hours mutator
    public void setHours(double hrs)
    {
        hours = hrs;
    }
    
    //wage mutator
    public void setWage(double w)
    {
        wage = w;
    }
    
    //overriding 
    public double earnings()
    {   
        double _hours = hours;
        if ( hours > 40) //if hours excess 40 hours, then the pay will be time-and-a-half
        {
            _hours = 40 + (hours - 40) * 1.5;
        }
        return wage * _hours;
    } 
    
    public String toString() //returns the string to the super
    {
        String earns = String.format("%.2f", earnings());
        return super.toString() + "\t$" + earns ;       
    }
}
