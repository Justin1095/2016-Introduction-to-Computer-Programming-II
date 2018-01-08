
/**
 * Justin Seda
 * 
 * This program demonstrates a try and catch.
 */
import java.io.*;
import java.util.Scanner;
public class Catch
{
    public static void main(String[] args)
    {
        try { 
            int x = getInt();
            System.out.println(x);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }


    public static int getInt() throws IOException
    {
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
            throw new IOException("This is not an integer.");
        }
    }

}  
