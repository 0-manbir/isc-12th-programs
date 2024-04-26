public class Fibonacci
{
    public static void main()
    {
        int n1=0, n2=1, sum=0;
        System.out.println(n1+"\n"+n2);
        
        for(int i=2; i<20; i++)
        {
            sum = n1+n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
//output - 0, 1, 1, 2, 3, 5, 8, 13 ... 4181