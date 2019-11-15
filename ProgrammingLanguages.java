
/**
 * Write a description of class ProgrammingLanguages here.
 
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ProgrammingLanguages
{
    public static void main(String [] args) {
     System.out.print('\u000C'); //clears screen
     System.out.println("\u000c\r");
        Scanner scan = new Scanner(System.in);
        
        // Make Programming Language Objects
        Python P = new Python(); 
        P.init();
        JavaScript JS = new JavaScript();
        JS.init();
        CSharp CSharp= new CSharp();
        CSharp.init();
        Swift S= new Swift();
        S.init();
        Java J = new Java();
        J.init();
        Ruby R = new Ruby();
        R.init();
        CPlusPlus C = new CPlusPlus();
        C.init();
        
        
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
            // Show Python options
            System.out.println("Python Options:");
            System.out.println(P.BirthDate.replace('^',' '));
            System.out.println(P.Creator.replace('^',' '));
            System.out.println(P.Owner.replace('^',' '));
            System.out.println(P.ReasonForDemand.replace('^',' '));
            System.out.println(P.GitHubUsageRank.replace('^',' '));
            System.out.println(P.KeyCompanies.replace('^',' '));
            System.out.println(P.AvgSalary.replace('^',' '));
            System.out.println(P.ide.replace('^',' '));
            System.out.println(P.frameworks.replace('^',' '));
            
            // Show JavaScript options
            System.out.println("JavaScript Options:");
            System.out.println(JS.BirthDate.replace('^',' '));
            System.out.println(JS.Creator.replace('^',' '));
            System.out.println(JS.Owner.replace('^',' '));
            System.out.println(JS.ReasonForDemand.replace('^',' '));
            System.out.println(JS.GitHubUsageRank.replace('^',' '));
            System.out.println(JS.KeyCompanies.replace('^',' '));
            System.out.println(JS.AvgSalary.replace('^',' '));
            System.out.println(JS.ide.replace('^',' '));
            System.out.println(JS.frameworks.replace('^',' '));
            
            // Show CSharp options
            System.out.println("C# Options:");
            System.out.println(CSharp.BirthDate.replace('^',' '));
            System.out.println(CSharp.Creator.replace('^',' '));
            System.out.println(CSharp.Owner.replace('^',' '));
            System.out.println(CSharp.ReasonForDemand.replace('^',' '));
            System.out.println(CSharp.GitHubUsageRank.replace('^',' '));
            System.out.println(CSharp.KeyCompanies.replace('^',' '));
            System.out.println(CSharp.AvgSalary.replace('^',' '));
            System.out.println(CSharp.ide.replace('^',' '));
            System.out.println(CSharp.frameworks.replace('^',' '));
            
            // Show Swift options
            System.out.println("Swift Options:");
            System.out.println(S.BirthDate.replace('^',' '));
            System.out.println(S.Creator.replace('^',' '));
            System.out.println(S.Owner.replace('^',' '));
            System.out.println(S.ReasonForDemand.replace('^',' '));
            System.out.println(S.GitHubUsageRank.replace('^',' '));
            System.out.println(S.KeyCompanies.replace('^',' '));
            System.out.println(S.AvgSalary.replace('^',' '));
            System.out.println(S.ide.replace('^',' '));
            System.out.println(S.frameworks.replace('^',' '));
            
            // Show Java options
            System.out.println("Java Options:");
            System.out.println(J.BirthDate.replace('^',' '));
            System.out.println(J.Creator.replace('^',' '));
            System.out.println(J.Owner.replace('^',' '));
            System.out.println(J.ReasonForDemand.replace('^',' '));
            System.out.println(J.GitHubUsageRank.replace('^',' '));
            System.out.println(J.KeyCompanies.replace('^',' '));
            System.out.println(J.AvgSalary.replace('^',' '));
            System.out.println(J.ide.replace('^',' '));
            System.out.println(J.frameworks.replace('^',' '));
            
            // Show Ruby options
            System.out.println("Ruby Options:");
            System.out.println(R.BirthDate.replace('^',' '));
            System.out.println(R.Creator.replace('^',' '));
            System.out.println(R.Owner.replace('^',' '));
            System.out.println(R.ReasonForDemand.replace('^',' '));
            System.out.println(R.GitHubUsageRank.replace('^',' '));
            System.out.println(R.KeyCompanies.replace('^',' '));
            System.out.println(R.AvgSalary.replace('^',' '));
            System.out.println(R.ide.replace('^',' '));
            System.out.println(R.frameworks.replace('^',' '));
            
            // Show Ruby options
            System.out.println("Ruby Options:");
            System.out.println(R.BirthDate.replace('^',' '));
            System.out.println(R.Creator.replace('^',' '));
            System.out.println(R.Owner.replace('^',' '));
            System.out.println(R.ReasonForDemand.replace('^',' '));
            System.out.println(R.GitHubUsageRank.replace('^',' '));
            System.out.println(R.KeyCompanies.replace('^',' '));
            System.out.println(R.AvgSalary.replace('^',' '));
            System.out.println(R.ide.replace('^',' '));
            System.out.println(R.frameworks.replace('^',' '));
            
            // Show C++ options
            System.out.println("C++ Options:");
            System.out.println(C.BirthDate.replace('^',' '));
            System.out.println(C.Creator.replace('^',' '));
            System.out.println(C.Owner.replace('^',' '));
            System.out.println(C.ReasonForDemand.replace('^',' '));
            System.out.println(C.GitHubUsageRank.replace('^',' '));
            System.out.println(C.KeyCompanies.replace('^',' '));
            System.out.println(C.AvgSalary.replace('^',' '));
            System.out.println(C.ide.replace('^',' '));
            System.out.println(C.frameworks.replace('^',' '));
            break;
            
            case 2:
            System.out.println("Input parameter");
            String input2 = scan.nextLine();
            try {
                int aa = Integer.valueOf(input);/*if input is 0, returns string that will terminate main method*/
                if(aa == 0) {
                    System.out.println("You are done searching");
                    break;
                }
            } catch(NumberFormatException e) {
                int aa = 1;
            } 
            input2 = "^" + input2.toLowerCase() + "^"; /*adds ^^ to the string*/
        
            // Check Python
            if(P.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               P.Creator.toLowerCase().indexOf(input2) >= 0 || 
               P.Owner.toLowerCase().indexOf(input2) >= 0 ||
               P.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               P.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               P.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               P.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               P.ide.toLowerCase().indexOf(input2) >= 0 || 
               P.frameworks.toLowerCase().indexOf(input2) >= 0) {
                System.out.println("Python");
            }
                
            // Check JavaScript
            if(J.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               J.Creator.toLowerCase().indexOf(input2) >= 0 || 
               J.Owner.toLowerCase().indexOf(input2) >= 0 ||
               J.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               J.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               J.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               J.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               J.ide.toLowerCase().indexOf(input2) >= 0 || 
               J.frameworks.toLowerCase().indexOf(input2) >= 0) {
                System.out.println("JavaScript");
            }
            
            //Check C#
            if(CSharp.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.Creator.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.Owner.toLowerCase().indexOf(input2) >= 0 ||
               CSharp.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               CSharp.ide.toLowerCase().indexOf(input2) >= 0 || 
               CSharp.frameworks.toLowerCase().indexOf(input2) >= 0) {
                System.out.println("C#");
            }
            
            //Check Sprint
            if(S.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               S.Creator.toLowerCase().indexOf(input2) >= 0 || 
               S.Owner.toLowerCase().indexOf(input2) >= 0 ||
               S.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               S.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               S.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               S.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               S.ide.toLowerCase().indexOf(input2) >= 0 || 
               S.frameworks.toLowerCase().indexOf(input2) >= 0) {
                System.out.println("Swift");
            }
            break;
        
    }
}while (cont);
}
}
