
/**
 * Justin Seda
 * 
 * This program gets the numbers in number.txt, adds all the numbers for each row, and gives the sums at the end of each row.
 */
import java.io.*;
import java.util.*;
public class Lab3
{
    public static void main()throws FileNotFoundException
    {
       File f = new File("numbers.txt");
       Scanner in = new Scanner(f);
       
       while (in.hasNextLine())
       {
         double total = 0;  
         for(int i = 0; i < 4; i++)
         {
             double num = in.nextDouble();
             total = total + num;
             System.out.print( num + " ");
            }
            System.out.println(total);
        }
        in.close();
    }

    
}
