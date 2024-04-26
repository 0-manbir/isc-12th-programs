import java.util.Scanner;

public class First_letter_11
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String inp = " "+s.nextLine(), out="", asc="";
        int index=0;
        
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i)==' ')
                out += inp.charAt(i+1);
        }
        
        for(int i=65; i<=90; i++){
            for(int j=0; j<out.length(); j++){
                if((int)out.charAt(j)==i)
                    asc += out.charAt(j);
            }
        }
        
        System.out.println("New word: "+out+"\nArranged: "+asc);
    }
}
