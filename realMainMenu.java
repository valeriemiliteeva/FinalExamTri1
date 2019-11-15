
/**
 * Write a description of class MainMenu here.
 *
 * @author (me)
 * @version (January 1, 2000)
 */
import java.util.*;
public class realMainMenu
{
    public static void main(String args[])
    {
        System.out.println("\u000c\r");
        Scanner scan = new Scanner(System.in);
        boolean cont = true; /*used in do while loop to keep everything running*/
        System.out.println("Hi Welcome To The Programming Languages Program!");
        do {
        
        int input = 0;
        boolean a = false; /*used in loop below to verify input*/
        int errorCount = 0; /*used to prevent infinate loop*/
        do {
            System.out.println("=========================");
            System.out.println("MENU SELECTION ATTRIBUTES");
            System.out.println("=========================");
            System.out.println("Press 0 at anytime to quit");
            System.out.println("Press 1 to see list of possible search parameters");
            System.out.println("Press 2 to begin searching");
            a = false;
            try {
                input = Integer.parseInt(scan.nextLine());
            } catch(NumberFormatException e) {
                a = true;
                System.out.println("Try again");
                errorCount++;
                if(errorCount >= 10) {
                    System.out.println("You are too stupid to run this program."); /*if more than 10 errors, exit*/
                    cont = false;
                }
            }
        } while(a && (0 <= input) && (input <= 2) && (errorCount < 10)); /*only accept inputs between 0 and 2*/
        
        switch(input)
        {
            case 0:
            cont = false;
            System.out.println("You are done searching."); /*input 0 terminates code*/
            break;
            case 1:
            System.out.println( list.name()); /*method prints out list of possible parameters*/
            break;
            case 2:
            String b = ask.question();/*question method takes searches for a language that matches inputed parameter*/
            if(b.equals(":q")) {
                System.out.println("You are done searching."); /*if 0 was inputed, return value is :q, and terminates because 0 was inputed.*/
                cont = false;
                break;
            } else {
            System.out.println("\n\n\n\nlanguages that match given parameters:\n" + b); /*prints out all the matches*/
            break;
        }
        }
        } while(cont);
    }
}
