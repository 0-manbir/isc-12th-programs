public class Series
{
    public static void main(int n)
    {
        System.out.print("The sum of "+n+" terms of the equation is "+term(n));
    }
    
    static double term(int n)
    {
        double a=0, b=1;
        double sum=0;
        
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                a+=j;
                b*=j;
            }
            sum += a/b;
            a=0;
            b=1;
        }
        return sum;
    }
}
