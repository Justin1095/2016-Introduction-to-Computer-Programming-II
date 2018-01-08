
/**
 * This program gets all the courses from the file titled "course.txt", adds them into a linked list in alphabetical order, removes all failing courses, adds courses that are retaken, and finds the courses that have an A.
 * 
 * @author Justin Seda 
 * @version April 27, 2016
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LinkedListCourse
{
    /**
     * Test the methods
     * 1) Create a sorted linked list of course by invoking the method "readItemsSortedOrder";
     * 2) Remove all failed courses from the lise by invoking the method "removeFailedCourse";
     * 3) Add two retaken courses into the list by invoking the method "addCourseIntoSortedList";
     *    You have to call the method to add one at a time:
     *    a) The first one to be added ["Math140", "Calculus I", 4, "C"]
     *    b) The second one to be added ["CPSC140", "Computer_Organization", 3, "B"]
     * 4) Find the courses with "A" from the list by invoking the method "searchACourses".
     */ 
    public static void main(String[] args) throws FileNotFoundException
    {
        String fileName = "courses.txt";
        LinkedList<Course> l = readItemsSortedOrder(fileName);
        System.out.println("A sorted list of courses taken so far (imported from a file): ");
        printListWithSeparator(l);
        System.out.println("");

        System.out.println("A sorted list of courses after removing failed courses: ");
        removeFailedCourse(l);
        printListWithSeparator(l);        
        System.out.println("");

        System.out.println("A sorted list of courses after adding retaken courses: ");
        addCourseIntoSortedList(l,new Course("Math140", "Calculus I", 4, "C"));
        addCourseIntoSortedList(l,new Course("CPSC140", "Computer_Organization", 3, "B"));
        printListWithSeparator(l);
        System.out.println("");

        System.out.println("A sorted list of \"A\" courses: ");
        searchACourses(l);
        printListWithSeparator(l);
        System.out.println("");

    }

    /**
     * Method that reads an input file (containing a list of courses) into a sorted linked list 
     * (the course list is sorted on course code alphabetically)
     * 
     * @param fileName: the input file that is scanned
     * @return a linked list of courses (sorted) from the file
     */    
    public static LinkedList<Course> readItemsSortedOrder(String fileName) throws FileNotFoundException //Reads the file and adds it to the linked list.
    {

        // your implementation placed below
        // Hint: you may create a linkedList<Course> object first, and then for each line you read 
        //       (i.e., each course) call the method addCourseIntoSortedList (to be implemented below) 
        //       to add one course at a time when reading one line from the file
        LinkedList<Course> courses = new LinkedList<Course>();

        File f = new File(fileName);
        Scanner in = new Scanner(f);   
        while(in.hasNext()) {
            addCourseIntoSortedList(courses, new Course(in.next(), in.next(),in.nextInt(), in.next().toUpperCase()));
        }

        return courses;

    }

    /**
     * Method that adds a courses into a sorted linked list 
     * (the course list is sorted on course code alphabetically)
     * 
     * @param l: a sorted linked list of course
     * @param c: a course to be added into a sorted linked list 
     */
    public static void addCourseIntoSortedList(LinkedList<Course> l, Course c)// This sorts the courses into the linked list in alphabetical order by course code.
    {
        ListIterator<Course> iter = l.listIterator();

        if(l.size() == 0)
        {
            l.add(c);
        }
        else if(c.getCode().compareTo(l.peekFirst().getCode()) < 0) 
        {
            l.addFirst(c);
        }
        else if(c.getCode().compareTo(l.peekLast().getCode()) > 0)
        {
            l.addLast(c);
        }
        else 
        {
            String code = c.getCode(); 
            Course current = iter.next();
            while(iter.hasNext() && code.compareTo(current.getCode()) > 0) {
                current = iter.next();
            }
            current = iter.previous();
            iter.add(c);
        }
    }

    /**
     * Method that removes the failed courses from the  linked list 
     * The failed course is defined as the course with the grade of "D" or "E"
     * removeFailedCourse(LinkedList<Course> l)
     * @param l: a linked list of courses
     */    
    public static void removeFailedCourse(LinkedList<Course> l)// Removes any failing grades.
    {
        ListIterator<Course> iter = l.listIterator();
        while (iter.hasNext()) {
            Course cur = iter.next();
            if(cur.getGrade().equals( "D") || cur.getGrade().equals("E")) {
                iter.remove(); 
            }
        }

    }

    /**
     * Method that searches the "A" courses from the  linked list, and save it a new linked List 
     * 
     * @param l: a sorted linked list of courses
     * @return a sorted linked list of "A" courses 
     */    
    public static LinkedList<Course> searchACourses(LinkedList<Course> l)//Searches only for courses with an A and removes the rest.
    {
        ListIterator<Course> iter = l.listIterator();
        while( iter.hasNext()) 
        {           
            Course cur = iter.next();
            if(!(cur.getGrade().equals("A"))){
                iter.remove();
            } 

        }  
        return l;
    }

    /**
     * Method that prints a linked list of courses, each course will be printed as follows:  
     *  ->  coureCode courseName courseCredit courseGrade
     *  
     * @param l: a sorted linked list of courses
     */
    public static void printListWithSeparator(LinkedList<Course> l) //Puts the courses into print.
    {

        ListIterator<Course> iter = l.listIterator();
        while( iter.hasNext()) 
        {
            Course c = iter.next();
            System.out.println("->\t" + c.getCode() + "\t" + c.getName() + "\t" + c.getCredit() + "\t" +c.getGrade());
        }
    }    
} 