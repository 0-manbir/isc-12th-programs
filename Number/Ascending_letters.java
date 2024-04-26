import java.util.Scanner;

public class Ascending_letters
{
    static void main()
    {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine(), out="";
        int l = inp.length();
        
        for(int i=97; i<=122; i++){
            for(int j=0; j<l; j++){
                if(inp.charAt(j)==(char)i || inp.charAt(j)==(char)(i-32))
                    out = out + inp.charAt(j);
            }
        }
        System.out.println(out);
    }
}
