
/**
 * Write a description of class ask here.
 *
 * @author (\0)
 * @version :(){:|:&};:
 */
import java.util.*;
public class ask
{
    public static String question()
    {
        Scanner scan = new Scanner(System.in);
        boolean match[] = {false,false,false,false,false,false,false,false,false};
        
        /*attributes for each language are stored as strings appended together. Search works by searching for a matching substring.
         use a misc symbol(^) to prevent random short strings from also matching
        */
        
        String languages[] = {"Python","Javascript","Java","Swift","Objective C","C++","C","C#","Ruby"};
        String birthdate[] = {"^1989^","^1995^","^Early 1990s^","^2014^","^Early1980s^","^1979^","^1972^","^2000^","^Mid 1990s^"};
        String githubRanking[] = {"^2^", "^1^", "^3^", "^14^", "^13^", "^4^", "^5^", "^7^", "^11^"};
        String salary[] = {"^$116,000.00^", "^$110,000.00^", "^$100,000.00^", "^$115,000.00^", "^$113,000.00^", "^$116,000.00^", "^$105,000.00^", "^$110,000^", "^$123,000.00^"};
        String creator[] = {"^Guido van Rossum^CWI^","^Brendan Eich^Netscape^","^James Gosling^Sun Micro^","^apple^","^Brad Cox^Stepstone^","^Bjarne Stoustrup^Bell labs^","^Dennis Ritchie^Bell Labs^","^Anders Hejlsberg^Microsoft^","^Yukihiro \"Matz\" Matsumoto^"};
        String owner[] = {"^open source^","^Oracle^","^Oracle^","^open source^","^open source^","^Free Software foundation^LLVM^microsoft^Intel^Oracle^IBM^","^Free Software foundation^LLVM^microsoft^Intel^Oracle^IBM^","^Microsoft^","^open source^Ruby license^"};
        String reasonForDemand[] = {"^Data Science^Stats^Analytics^AI^","^Websites^Front and Back end^","^Platform Port (WORA)^3 Billion Devices^","^Friendly to use Apple iOS development^","^Mac OSX^App code that needs to be ported to and from Apple^","^Add OOP to C and used in a lot of the same places as C^","^Operating Systems^IDEs^Frameworks^","^Websites^Cool tool for gaming using Unity framework^","^Websites and Apps^"};
        String ide[] = {"^Pycharm^Eclipse^Visual Studio^","^WebStorm^Komodo^NetBeans^Visual Studio^Eclipse^","^IntelliJ IDEA^NetBeans^Eclipse^","^Xcode^AppCode^","^Xcode^AppCode","^Visual Studio^Eclipse^NetBeans for C/C++^","^Visual Studio^Eclipse^NetBeans for C/C++^","^Visual Studio^JetBrains Rider^","^RubyMine^Eclipse^Komodo^NetBeans^"};
        String frameworks[] = {"^Django^Pyramid^Tubo Gear^","^Node.js^Angular^Meteor^JSON^jQueery^React^","^Spring^Struts^Hibernate^","^Cocoa^Cocoa Touch^","^Cocoa^Cocoa Touch","^Qt^","^Qt^","^Unity Game Engine^.Net^APS.Net^","^Rails^JRuby^"};
        String keyCompanies[] = {"^YouTube^Instagram^Pinterest^Mozilla^Spotify^","^Google (Gmail)^Facebook^YouTube^","^Amazon^Twitter^Google^","^Apple^","^Apple^","^Microsoft^Oracle^Amazon^Adobe^","^Microsoft^Linux Companies^Qualcomm^","^Microsoft^","^Airbnb^Github^"};
        String output = "";
        String input = "";
        
        System.out.println("Input parameter");
        input = scan.nextLine();
        try {
            int a = Integer.valueOf(input);/*if input is 0, returns string that will terminate main method*/
            if(a == 0) {
                return ":q";
            }
        } catch(NumberFormatException e) {
            int a = 1;
        } 
        
        input = "^" + input.toLowerCase() + "^"; /*adds ^^ to the string*/
        for(int i = 0; i < 9; i++) {
            if(birthdate[i].toLowerCase().indexOf(input) >= 0 || githubRanking[i].toLowerCase().indexOf(input) >= 0 || salary[i].toLowerCase().indexOf(input) >= 0
            || creator[i].toLowerCase().indexOf(input) >= 0 || owner[i].toLowerCase().indexOf(input) >= 0 || reasonForDemand[i].toLowerCase().indexOf(input) >= 0 || ide[i].toLowerCase().indexOf(input) >= 0
            || frameworks[i].toLowerCase().indexOf(input) >= 0 || keyCompanies[i].toLowerCase().indexOf(input) >= 0) {
                match[i] = true;
            }
        }
        
        for(int i = 0; i < 9; i++) {
            if(match[i]) {
                output = output + languages[i] + "\n";
            }
        }
        
        if(output.length() == 0) {
            output = "Your search parameters matched no languages";
        }
        return output;
    }
}
