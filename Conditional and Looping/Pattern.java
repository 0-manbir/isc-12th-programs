public class Pattern
{
    public static void main(int n)
    {
        for(int i=2; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print(n);
            System.out.print(", ");
        }
    }
}
//sample input - 4
//output       - 44, 444, 4444
