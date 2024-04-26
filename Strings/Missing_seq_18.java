import java.util.Scanner;

public class Missing_seq_18
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inp = s.next().toUpperCase();
        StringBuffer str = new StringBuffer();
        
        for(int i=65; i<=90; i++)
        {
            for(int j=0; j<inp.length(); j++){
                if(inp.charAt(j)==i)
                    str.append(inp.charAt(j));
            }
        }
        System.out.print("Arranged word: "+str+"\nMissing letters: ");
        
        for(int i=1; i<str.length(); i++){
            char c1=str.charAt(i-1), c2=str.charAt(i);
            while(c1!=(char)(c2-1)){
                c1++;
                System.out.print((char)c1);
            }
        }
    }
}
