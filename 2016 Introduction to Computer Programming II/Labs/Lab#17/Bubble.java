
/**
 * Justin Seda
 * Java bubble sort 
 */
import java.util.*;
public class Bubble
{
    public static void main() {
        int [] numbers = new int[100];
        int count=0;

        // read numbers into an array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a bunch of numbers followed by q: ");
        while (in.hasNextInt()) {
            numbers[count] = in.nextInt();
            count++;
        }
        Bubbles(numbers, count);
        printArray(numbers, count);
    }
    
     public static void printArray(int [] arr, int size ){
        for (int i = 0; i < size; i++) {
            System.out.print("" + arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void Bubbles(int [] arr, int size) {
        
        for(int i = 1; i < size; i++) {
            for( int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
