
/**
 * Justin Seda
 * 
 * This program gets the middle value in the array. 
 */
public class ArrayOps
{
    /**
    This method accepts and integer array as a parameter, and then
    returns the "middle" value of the array.
    For an array of odd length, this would be the actual middle value.
    For an array of even length, there are TWO middle values, so only
    the first of the two values is returned.
    @param values, an array of integers
    @ return, the "middle" element of the array
     */
    public static void main (String [] args)
    {
        int [] values = {6, 23 ,34, 54 ,544 }; 
        int mid = middleArray(values);
        int [] values2 = {5, 6, 78, 9};
        int mid1 = middleArray(values2);
        System.out.println(mid);
        System.out.println(mid1);
    }
    
    public static int middleArray(int values[])
    { 
        int size = values.length;
        int mid = values.length/2;
        int middle = values[mid];
        if (size % 2 == 0)
        {
            mid = values.length/2-1;
            middle = values[mid];
        }
        return middle;
    }

}
