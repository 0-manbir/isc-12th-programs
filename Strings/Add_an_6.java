import java.util.Scanner;

public class Add_an_6
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp = " "+s.nextLine(), out="";
        
        for(int i=0; i<inp.length(); i++)
        {
            if(inp.charAt(i)==' '){
                char ch = Character.toLowerCase(inp.charAt(i+1));
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    out += (i==0)?"an ":" an ";
                else
                    out += " ";
            }else
                out += inp.charAt(i);
        }
        
        System.out.println(out);
    }
}
