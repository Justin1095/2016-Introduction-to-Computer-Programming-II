
/**
 * This program counts all the letters that are in a string, prints a star for the amount of time each letter is presented, and prints out the most frequent letter.
 * 
 * Justin Seda
 * Feb. 10, 2016 
 */
public class LetterCounter_ArrayApp
{
    static String alp = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String [] args)
    {
        System.out.println("Letter Frequency: counting the frequencies of letters.");
        int [] a1 = countLetters("counting the frequencies of letters");
        printLetterFreq(a1);
        System.out.println("The most frequent letter is: " + mostFreqLetter(a1));
        System.out.println("");

        System.out.println("Letter Frequency: Computer programming II is fun");
        int [] a2 = countLetters("Computer programming II is fun");
        printLetterFreq(a2);
        System.out.println("The most frequent letter is: " + mostFreqLetter(a2));
        System.out.println("");

        System.out.println("Letter Frequency: After a fairly tame season so far -- especially compared to the last one -- a monster storm loomed Friday over the Carolinas north to New England, spurring people to hunker down with their shovels, coffee and ideally firewood, given real fears that powerful winds and heavy snow and ice could knock out power. Roughly 75 million people total are in the path, 30 million of whom are under blizzard watches or warnings.");
        int [] a3 = countLetters("After a fairly tame season so far -- especially compared to the last one -- a monster storm loomed Friday over the Carolinas north to New England, spurring people to hunker down with their shovels, coffee and ideally firewood, given real fears that powerful winds and heavy snow and ice could knock out power. Roughly 75 million people total are in the path, 30 million of whom are under blizzard watches or warnings.");
        printLetterFreq(a3);
        System.out.println("The most frequent letter is: " + mostFreqLetter(a3));
        System.out.println("");

        System.out.println("Letter Frequency: Our department boasts an employment rate for graduates of nearly 100% in the field. Graduating students have recently been placed in a wide variety of organizations, including: Cisco Systems, Hershey Foods, IBM, Lockheed Martin, Merck, New York Life, National Security Agency (NSA), Pocono Medical Center, Proteus Technologies, Sanofi-Pasteur, Situational Awareness Systems, Space and Naval Warfare Systems (SPAWAR), US Army R&D Center at Picatinny Arsenal, NJ, Vanguard Investments, Verizon, and Vonage.");
        int [] a4 = countLetters("Our department boasts an employment rate for graduates of nearly 100% in the field. Graduating students have recently been placed in a wide variety of organizations, including: Cisco Systems, Hershey Foods, IBM, Lockheed Martin, Merck, New York Life, National Security Agency (NSA), Pocono Medical Center, Proteus Technologies, Sanofi-Pasteur, Situational Awareness Systems, Space and Naval Warfare Systems (SPAWAR), US Army R&D Center at Picatinny Arsenal, NJ, Vanguard Investments, Verizon, and Vonage.");
        printLetterFreq(a4);
        System.out.println("The most frequent letter is: " + mostFreqLetter(a4));
        System.out.println("");
    }

    public static int [] countLetters(String str) //Compares and counts the letters on the string to the alphabet.
    {
        String result = str.toLowerCase();
        char [] data = result.toCharArray(); 
        int[] countArray = new int[26];
        for (char tmp : data)
        {
            for (int i = 0; i < alp.length(); i++)
            {
                if (alp.charAt(i) == tmp)
                {
                    countArray[i]++;                   
                }
            }
        }
        return countArray;
    }

    public static void printLetterFreq(int [] countArray) //Print out the letters, number of times it's shown, and stars.
    {
        for (int i = 0; i < 26; i++)
        {
            if(countArray[i] != 0)
            {
                System.out.print(alp.charAt(i));
                System.out.println( " (" + countArray[i] + ") :" +  numToStar(countArray[i]));// gets the numbers
            }
        }
    }

    public static String numToStar(int num) //Turns numbers into stars.
    {
        String str = "";
        for(int i = 0; i < num; i++)
        {
            str += "*";
        }
        return str;
    }

    public static char mostFreqLetter(int [] countArray) //Finds the most frequent used letter.
    {
        int max = 0;
        int maxLoc = 0;
        for (int i = 0; i < alp.length(); i++)
        {
            if(countArray[i] > max)
            {
                max = countArray[i];
                maxLoc = i;
            }
        }
        return alp.charAt(maxLoc);
    }
}