public class Pattern_25a
{
    public static void main()
    {
        int t=3;
        for(int i=4; i>=0; i--)
        {
            for(int j=0; j<i; j++)
                System.out.print("  ");
            System.out.print("*");
            
            if(i!=4){
                for(int j=1; j<=t; j++)
                    System.out.print(" ");
                System.out.print("*");
                t+=4;
            }
            
            System.out.println();
        }
        
        int p=11;
        for(int i=1; i<=4; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print("  ");
            System.out.print("*");
            
            if(i!=4){
                for(int j=1; j<=p; j++)
                    System.out.print(" ");
                System.out.print("*");
                p-=4;
            }
            
            System.out.println();
        }
    }
}
