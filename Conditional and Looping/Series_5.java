public class Series_5
{
    public static void main(int a, int b, int n)
    {
        double sum = 0;
        
        for(int i=2; i<=n; i++)
            sum += Math.pow(a+b, i) / i;
        
        System.out.print(sum);
    }
}
