import java.util.Scanner;

public class Longest_word_1
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String longest = "";
        System.out.println("Enter 10 words: ");
        
        for(int i=0; i<10; i++){
            String inp = s.next();
            if(inp.length()>longest.length())
                longest = inp;
        }
        
        System.out.println("Longest Word: " + longest + "\nLength: " + longest.length());
    }
}
