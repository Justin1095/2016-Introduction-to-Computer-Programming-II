
/**
 * Justin Seda
 * 
 * This program also gets the numbers in number.txt, adds all the numbers for each row, and gives the sums at the end of each row.
 */
import java.io.*;
import java.util.*;
public class Lab3B
{
    public static void main()throws FileNotFoundException
    {
        File f = new File("numbers.txt");
        Scanner in = new Scanner(f);

        while (in.hasNextLine())
        {
            String line = in.nextLine();
            Scanner in2 = new Scanner(line);
            double total = 0;  
            while (in2.hasNextDouble())
            {
                double num = in2.nextDouble();
                total = total + num;
                System.out.print( num + " ");

            }
            System.out.println(total);
        }
    }
}