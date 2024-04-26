import java.util.Scanner;

public class descending_numbers
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String inp = s.next();
        
        for(int j=9; j>=0; j--){
            for(int i=0; i<inp.length(); i++){
                if(Integer.parseInt(inp.charAt(i)+"")==j)
                    System.out.print(j);
            }
        }
    }
}
