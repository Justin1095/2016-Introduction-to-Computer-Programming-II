
/**
 * Justin Seda
 * 
 * Tree Set
 */
import java.util.TreeSet;
import java.util.Set;
public class TreeSetRunner
{
    public static void main(String[] args) {
        TreeSet<String> letters = new TreeSet<String>();
        letters.add("aaa");
        letters.add("bbb");
        letters.add("ccc");
        letters.add("ddd");
        letters.add("fff");
        letters.add("ggg");
        letters.add("hhh");
        letters.add("iii");
        
        letters.add("aaa");
        letters.add("bbb");
        letters.add("ccc");
        letters.add("ddd");
        letters.add("fff");
        letters.add("ggg");
        letters.add("hhh");
        letters.add("iii");
        
        for(String let: letters) {
            System.out.print("  " + let);
        }
    }

}