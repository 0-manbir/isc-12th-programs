import java.util.*;
public class Magic_num
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n1, sum=0;
        
        while(n>9)
        {
            n1=n;
            sum=0;
            while(n1>0){
                sum += n1%10;
                n1/=10;
            }
            n=sum;
        }
        
        System.out.println((sum==1)?"yes":"no");
    }
}
