import java.util.Scanner;

public class Name_5
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String inp = s.nextLine();
        int index = inp.lastIndexOf(" ");
        
        System.out.print(inp.substring(index+1) + ", " + inp.substring(0,index));
    }
}
