
/**
 * Write a description of class list here.
 *
 * @author (StringIndexOutOfBoundsException)
 * @version (127.0.0.1)
 */
public class list
{
    public static String name() /*array of all possible parameters*/
    {
        String param[] = {"1989", "1995", "Early 1990s", "2014", "Early 1980s", "1979", "1972", "2000", "Mid 1990s",
        "2", "1", "3", "14", "13", "4", "5", "7", "11","$116,000.00", "$110,000.00", "$100,000.00", "$115,000.00", 
        "$113,000.00", "$116,000.00", "$105,000.00", "$123,000.00","Guido van Rossum", "CWI", "Brendan Eich",
        "Netscape", "James Gosling", "Sun Micro", "Apple", "Brad Cox", "Stepstone", "Bjarne Stoustrup", "Bell Labs", 
        "Dennis Ritchie","Anders Hejlsberg", "Microsoft", "Yukihiro \"Matz\" Matsumoto","Open Source", 
        "Oracle","Free Software Foundation", "LLVM", "Microsoft", "Intel", "IBM","Ruby License","Data Science", 
        "Stats", "Analytics", "AI", "Websites", "Front and Back End", "Platform Port (WORA)",  "3 Billion Devices", 
        "Friendly to use Apple iOS development", "Mac OSX", "App code that needs to be ported to and from Apple", 
        "Add OOP to C and used in a lot of the same places as C", "Operating Systems", "IDEs", "Frameworks", "Websites", 
        "Cool tool for gaming using Unity framework", "Websites and Apps","YouTube", "Instagram", "Pinterest", "Mozilla", 
        "Spotify", "Google (Gmail)", "Facebook","Google", "Amazon", "Twitter", "Adobe", "Linux Companies", "Qualcomm", 
        "Airbnb", "GitHub","Django","Pyramid","Tubo Gear","Node.js","Angular","Meteor","JSON","jQueery","React","Spring","Struts",
        "Hibernate","Cocoa","Cocoa Touch","Qt","Unity Game Engine",".Net","APS.Net","Rails","JRuby","Pycharm","Eclipse",
        "Visual Studio","WebStorm","Komodo","NetBeans","IntelliJ IDEA","NetBeans","Xcode","AppCode","NetBeans for C/C++",
        "JetBrains Rider","RubyMine"};
        
        String output = "Possible Parameters:\n";
        for(int i = 0; i < param.length; i++) {
            if(i % 3 == 0) {            /*formats into 3 collums*/
                output = output + "\n";
            }
            output = output + "[" + param[i] + "], ";
        }
        return output;
    }
}
