
/**
 * Justin Seda
 * 
 * test the linked list
 */
public class LinkedListRunner
{
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        myList.addFirst("aaa");
        myList.addFirst("bbb");
        myList.addFirst("ccc");
        myList.addFirst("ddd");
        System.out.println(myList);
         System.out.println(myList);
       System.out.println("Removed element:  " + myList.removeFirst());
       System.out.println("Removed element:  " + myList.removeFirst());
       System.out.println(myList);
    }
}