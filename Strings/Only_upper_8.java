import java.util.Scanner;

public class Only_upper_8
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp = s.nextLine()+" ", out="";
        int index = 0;
        
        for(int i=0; i<inp.length(); i++)
        {
            if(inp.charAt(i)==' '){
                String word = inp.substring(index, i);
                if(word.charAt(0) == Character.toUpperCase(word.charAt(0)) && 
                   word.charAt(word.length()-1) == Character.toLowerCase(word.charAt(word.length()-1)))
                    System.out.println(word);
                index = i+1;
            }
        }
    }
}
