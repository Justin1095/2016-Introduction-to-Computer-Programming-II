
/**
 * Test Employee
 * Takes information for data.txt,finds employee's weekly salaries and displays which employee is Fulltime or Parttime.
 * 
 * @author Justin Seda 
 * @version March 23, 2016
 */
import java.io.*;
import java.util.*;
public class EmployeeTester
{
    public static void main(String [] args) throws FileNotFoundException 
    {
        System.out.println("----------------------------------------------");
        System.out.println("A List of Employees and Their Weekly Salaries:");
        System.out.println("----------------------------------------------");

        Employee [] emp = new Employee[10]; //stores each employee  

        File  f = new File("data.txt"); //gets the file
        Scanner in = new Scanner(f);
        int empType = 0; //type of employee
        int numEmps = 0; //numbers of employees

        while(in.hasNextLine()) //Founds out if the employee is Fulltime or Parttime from the number (1 or 2)on each line 
        {
            if(in.hasNextInt())
            {
                empType = in.nextInt();
                if(empType == 1) //FullTimeEmployee
                {
                    emp[numEmps] = new FullTimeEmployee(in.next(), in.next(), in.next(), in.nextDouble());
                }
                else if(empType == 2) //PartTimeEmployee
                {
                    emp[numEmps] = new PartTimeEmployee(in.next(), in.next(),in.next(), in.nextDouble(), in.nextDouble());
                }
                numEmps++;
            }
        }

        for (int i = 0; i <numEmps; i++) //Prints out the results
        {
            System.out.println(emp[i].toString());
        }

        System.out.println("---------------------");
        System.out.println("Employee Information:");
        System.out.println("---------------------");

        for(int i = 0; i < numEmps; i++) //Prints if the employee is Fulltime or Parttime
        {
            String str = "Empolyee "+ (i+1) + " is a " + emp[i].getClass();
            String str2 = str.substring(0,16) + str.substring(22, str.length());
            System.out.println(str2);
        } 
        
    }
}