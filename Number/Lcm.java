import java.util.*;

class Lcm
{
    static void main()
    {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(), b=s.nextInt(), gn = a>b?a:b;
        
        while(true)
        {
            if(gn%a==0 && gn%b==0)
            {
                System.out.println(gn);
                break;
            }
            gn++;
        }
    }
}  