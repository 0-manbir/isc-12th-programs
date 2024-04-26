public class Descending_digits
{
    public static void main(int n)
    {
        int n1=n;
        
        for(int i=9; i>=0; i--)
        {
            while(n1>0)
            {
                if(i==n1%10)
                    System.out.print(i);
                n1/=10;
            }
            n1=n;
        }
    }
}
