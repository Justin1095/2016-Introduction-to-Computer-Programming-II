
/**
 * Moves a bug in a 5 X 10 grid.
 * User inputs the directions.
 * 
 * @author Justin Seda
 * @version March 2, 2016
 */
public class Bug
{
    private int row;
    private int column;
    private int direction;
    
    //default constructor
    public Bug() 
    {
        row = 1;
        column = 1;
        direction = 0;
    }
    
    // constructors (with parameters)
    public Bug( int r, int c, int d)
    {
        row = r;
        column = c;
        direction = d;
    }
    
    //accessor methods
    public int getRow() 
    {
        return row;   
    }

    public int getColumn()
    {
        return column; 
    }

    public int getDirection()
    {
        return direction;  
    }
    
    //mutator methods
    public void turn(int d)
    {
        direction = d;
    }

    public void reset()
    {
        row = 1;
        column = 1;
        direction = 0;    
    }

    public void move(int num)//Finds out what the direction is
    {
        if (num < 0)
        {
            System.out.println("Can't move negative amounts!");
            return;
        }
        else if (direction == 0)//north
        {
            row = Math.max(1, row - num); //It goes up until it hits 1. Ex. if we are on row 5 and want the bug to move 3 spaces, 5-3 = 2, it will move to row 2.
            if (row == 1)
            {
                System.out.println("Hit the wall on the North Boundary");
            }
        }
        else if (direction == 1) //east
        {
            column = Math.min( column + num, 10); //It goes to the right until it hits 10.
            if (column == 10)
            {
                System.out.println("Hit the wall on the East Boundary");
            }
        }
        else if (direction == 2) //south
        {
            row = Math.min(row + num, 5); //It goes down until it hits 10.
            if (row == 5)
            {
                System.out.println("Hit the wall on the South Boundary");
            }
        }
        else if (direction == 3) //west
        {
            column = Math.max(1, column - num);//It goes to the left until it hits 1.
            if (column == 1)
            {
                System.out.println("Hit the wall on the West Boundary");
            }
        }
    }

    char dirStr;//direction String 
    public void printCurrentPosition()
    {

        switch(direction)// states if it's north,east, south, west
        {
            case 0: dirStr = 'N'; break;
            case 1: dirStr = 'E'; break;
            case 2: dirStr = 'S'; break;
            case 3: dirStr = 'W'; break;
        }

        for (int i = 1; i <= 5; i++)// makes the dots
        {
            for (int j = 1; j <= 10; j++)
            {
                if(i == row && j == column)
                {
                    System.out.print(dirStr);
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
