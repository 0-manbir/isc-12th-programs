public class Series_2
{
    public static void main(int n)
    {
        int sum = 0;
        
        for(int i=1; i<=n; i++)
            sum += i * (i+1);
        
        System.out.println(sum);
    }
}
