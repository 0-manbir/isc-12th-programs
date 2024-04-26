import java.util.Scanner;

public class Sum
{
    static int pe=0, po=0, ne=0, no=0;
    
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        
        while(true)
        {
            int n = s.nextInt();
            if(n!=0)
                calc(n);
            else{
                System.out.println("Positive Even: "+pe+"\nPositive Odd: "+po+"\nNegative Even: "+ne+"\nNegative Odd: "+no);
                break;
            }
        }
    }
    
    static void calc(int n)
    {
        if(n%2==0){
            if(n>0)
                pe+=n;
            else   
                ne+=n;
        }else{
            if(n>0)
                po+=n;
            else   
                no+=n;
        }
    }
}
