
/**
 * Justin Seda
 * 
 * This program demonstrates the linked list iterator.
 */
import java.util.*;
public class LinkedListRunner
{
    public static void main(String[] args)
    {
        LinkedList<String> letters = new LinkedList<String>();
        letters.add("aaa");
        letters.add("bbb");
        letters.add("ccc");
        letters.add("ddd");
        letters.add("fff");
        letters.add("ggg");
        letters.add("hhh");
        letters.add("iii");

        ListIterator<String> iterator = letters.listIterator();

        while(iterator.hasNext()) 
        {
            String value = iterator.next();
            System.out.println(value);
        }

        while (iterator.hasPrevious())
        {
            String value = iterator.previous();
            if(value.charAt(0) == ('a') ||value.charAt(0) == ('e')||value.charAt(0) == ('i'))
            {
                iterator.remove();
            }
        }

        while(iterator.hasNext()) 
        {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
