public class pattern2
{
    static void main()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<5-i; j++)
                System.out.print("  ");
            for(int j=0; j<i; j++)
                System.out.print(i+"   ");
            System.out.println();
        }
        
        for(int i=4; i>0; i--)
        {
            for(int j=0; j<5-i; j++)
                System.out.print("  ");
            for(int j=0; j<i; j++)
                System.out.print(i+"   ");
            System.out.println();
        }
    }
}
