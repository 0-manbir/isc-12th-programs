public class Series_1
{
    public static void main(int n)
    {
        boolean sign = true;
        int sum=0;
        
        for(int i=1; i<=n; i++)
        {
            sum = sign ? (sum+(int)Math.pow(i,i)) : (sum-(int)Math.pow(i,i));
            sign = !sign;
        }
        
        System.out.println(sum);
    }
}
