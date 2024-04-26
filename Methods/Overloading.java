public class Overloading
{
    int series(double n)
    {
        int sum=0;
        
        for(int i=1; i<=n; i++)
            sum += i/(i+1);
        
        return sum;
    }
    
    int series(double a, double n)
    {
        int sum=0, t=1;
        
        for(int i=2; i<=n; i++)
        {
            sum += t/Math.pow(a,i);
            t+=3;
        }
        
        return sum;
    }
}
