public class Series_3
{
    public static void main(int n)
    {
        boolean sign = true;
        int sum=0;
        
        for(int i=1; i<=n; i++)
        {
            sum = sign ? (sum+i*i) : (sum-i*i*i);
            sign = !sign;
        }
        
        System.out.println(sum);
    }
}
