public class Prime_numbers
{
    public static void main(int n)
    {
        for(int i=0; i<50;)
        {
            n++;
            if(prime(n)==0){
                System.out.println(n);
                i++;
            }
        }
    }
    
    static int prime(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
                return 1;
        }
        return 0;
    }
}
