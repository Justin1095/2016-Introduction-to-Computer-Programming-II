
/**
 * Justin Seda
 * 
 * Hash Set
 */
import java.util.HashSet;
import java.util.Set;

public class HashedSetRunner
{
    public static void main(String[] args) {
        HashSet<String> letters = new HashSet<String>();
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
