import java.util.*;
public class Ascending_digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n1;
        
        for(int i=0; i<=9; i++)
        {
            n1 = n;
            while(n1>0){
                if(n1%10==i)
                    System.out.print(i+", ");
                n1/=10;
            }
        }
    }
}