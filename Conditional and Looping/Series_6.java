public class Series_6
{
    public static void main(int a, int n)
    {
        double sum=0, f;
        boolean sign = true;
        
        for(int i=1; i<=n; i++)
        {
            f=1;
            for(int j=1; j<=i; j++)
                f*=j;
            
            sum = sign ? (sum+f/Math.pow(a,i)) : (sum-f/Math.pow(a,i));
            sign = !sign;
        }
        
        System.out.println(sum);
        
        if(sign)
            sum += f/Math.pow(a,i);
        else
            sum -= f/Math.pow(a,i);
        
        sign = !sign;
    }
}
