
/**
 * Justin Seda
 * 
 * This program demonstrates a throw.
 */
import java.util.Scanner;

public class Throwing
{
    public static void main(String[] args)
    {
        int x = getInt();
        System.out.println(x);
    }

    public static int getInt() throws IllegalArgumentException{
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an Integer:");
        if(in.hasNextInt())
        {
            num = in.nextInt();
            return num;
        }
        else 
        {
            throw new IllegalArgumentException("This is not an integer.");          
        }
    }  
}