import java.util.Scanner;

public class Consecutive_repeated_17
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp=s.nextLine(), inp1=inp;
        boolean print = false;
        
        System.out.println("\nRepeated letters: ");
        for(int i=0; i<inp.length(); i++)
        {
            for(int j=0; j<inp.length(); j++)
            {
                if(inp.charAt(j)==inp.charAt(i) && inp.charAt(i)!=' ' && j!=i){
                    System.out.println(inp.charAt(i));
                    inp = inp.replace(inp.charAt(j), ' ');
                    break;
                }
            }
            print = false;
        }
        
        System.out.println("\nConsecutive letters: ");
        for(int i=1; i<inp1.length(); i++)
        {
            if(inp1.charAt(i-1) == (char)(inp1.charAt(i)-1)){
                System.out.println(inp1.charAt(i-1) + " --> " + inp1.charAt(i));
            }
        }
    }
}
