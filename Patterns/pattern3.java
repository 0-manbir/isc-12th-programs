public class pattern3
{
    static void main()
    {
        for(int i=1; i<=9; i+=2){
            for(int j=0; j<(9-i)/2; j++)
                System.out.print("   ");
            for(int j=1; j<=i; j++)
                System.out.print(i+"  ");
            System.out.println();
        }
        
        for(int i=7; i>0; i-=2){
            for(int j=0; j<(9-i)/2; j++)
                System.out.print("   ");
            for(int j=1; j<=i; j++)
                System.out.print(i+"  ");
            System.out.println();
        }
    }
}
