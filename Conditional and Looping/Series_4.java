public class Series_4
{
    public static void main(int n)
    {
        double out=0, sum=0, prod=1;
        
        for(int i=2; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                sum += j;
                prod *= j;
            }
            out += prod/sum;
            prod=1;
            sum=0;
        }
        
        System.out.println(out);
    }
}
