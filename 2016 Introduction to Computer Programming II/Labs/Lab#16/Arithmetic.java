
/**
 * Justin Seda
 * 
 * This program finds the gcd of 80 and 60.
 */
public class Arithmetic
{
    public static void  main(String[] args) {
       System.out.println(gcd( 80, 60)); 
    }


    public static int gcd(int a, int b)
    {
        if ( a == 0) {
            return b;
        } else if ( b == 0){ 
            return a;
        } else if (a > b) {
            return gcd( b, a%b);
        } else if ( b > a) {
            return gcd ( a, b%a);
        }
        return -1;
    }
}


