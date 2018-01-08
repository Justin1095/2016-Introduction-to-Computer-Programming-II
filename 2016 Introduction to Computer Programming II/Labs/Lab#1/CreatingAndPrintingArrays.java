
/**
 * Justin Seda
 * 
 * This program just simply prints out an array.
 */
public class CreatingAndPrintingArrays
{
    public static void main() {
        int [] x = { 8, 4 , 4 ,21, 7, 9, 18, 2 ,100};
        System.out.println("Length of Array x : " + x.length);
        System.out.println("First Array item : " + x[0]);
        System.out.println("Last Array item : " + x[8]);
        System.out.println(x[x.length - 1]+ " This is the same as part d becuase of x.length - 1. The x.length - 1 goes to the end of the length.");
        int size = x.length;
        for ( int i = 0; i < size; i++) {
            System.out.println( x[i]);
        }

        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        for (int i = x.length-1; i >= 0; i--) {
             System.out.println("x[" + i + "]: " + x[i]);
        }
        for (int values : x) {
            System.out.println(values);
        }
    }

}
