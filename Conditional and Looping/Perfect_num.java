public class Perfect_num
{
    public static void main(int n)
    {
        int sum=0;
        
        for(int i=1; i<n; i++){
            if(n%i==0)
                sum+=i;
        }
        
        System.out.println((sum==n)?"Perfect number":"Not a perfect number");
    }
}
