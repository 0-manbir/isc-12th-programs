public class Series_7
{
    public static void main(int a)
    {
        double sum = 0, f;
        
        for(int i=10; i>=2; i--)
        {
            f=1;
            
            for(int j=1; j<i; j++)
                f*=j;
            
            sum += Math.pow(a,i) / f;
        }
        
        System.out.println(sum);
    }
}
