
/**
 * This will test the bug.
 * 
 * @author Justin Seda
 * @version March 2, 2016
 */
import java.util.*;
public class BugTester
{
    public static void main()
    {
        int turn = 0;
        int move = 0;
        int dec = 0; //decision
        boolean anGame = false; // another game 

        Scanner in = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("*****Welcome to the bug's world******");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("Bug's Initial Postion"); 
        Bug b = new Bug();
        b.printCurrentPosition();

        while (!anGame)
        {
            System.out.println("");

            System.out.print("Please enter the direction (0-N, 1-E, 2-S, 3-W) for the bug to turn: ");
            if(in.hasNextInt()) 
            {
                turn = in.nextInt();
                if (turn <= -1 || turn >= 4)
                {
                    System.out.println("Error, please input a number form 0 to 3"); 
                    turn = in.nextInt();
                }
            }
            else 
            {
                System.out.println("Error");
            }

            System.out.print("Please enter the number of units for the bug to move: ");
            if(in.hasNextInt()) 
            {
                move = in.nextInt();
            }
            else 
            {
                System.out.println("Error");
                in.next();
            }

            System.out.println("");
            System.out.println("Bug's Current Position"); 
            b.turn(turn);
            b.move(move);
            b.printCurrentPosition();

            System.out.println("");
            System.out.println("/////////////////////////////////////////");
            System.out.print("Turn and move the bug again(1 or 0)? (1-Yes, 0-No)");
            if(in.hasNextInt()) 
            {
                dec = in.nextInt();
                if (dec == 0)
                {
                    anGame = true;  
                }
                else if (dec > 1)
                {
                    System.out.println("Error");
                    in.next();
                }  
            }
            else 
            {
                System.out.println("Error");
                in.next();
            }

        }
    }
}
