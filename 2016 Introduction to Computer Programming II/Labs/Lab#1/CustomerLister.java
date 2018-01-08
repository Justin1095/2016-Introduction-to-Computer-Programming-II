
/**
 * Justin Seda
 * 
 * This program prints out a string array.
 */
public class CustomerLister
{
    public static void main() {
        String [] customerNames = new String[5];
        customerNames[0] = "Cathy";
        customerNames[1] = "Ben";
        customerNames[2] = "Jorge"; 
        customerNames[3] ="Wanda";
        customerNames[4] ="Freddie";
        for (int i = 0; i < 5; i++) {
            System.out.println(customerNames[i]);  
        }
    }

}
