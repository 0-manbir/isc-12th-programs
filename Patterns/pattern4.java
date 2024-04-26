public class pattern4
{
    static void main()
    {
        for(int i=0; i<=4; i++){
            for(int j=0; j<4-i; j++)
                System.out.print("  ");
            System.out.print("* ");
            for(int j=1; j<i*2; j++)
                System.out.print("  ");
            System.out.print(i==0?"":"*");
            System.out.println();
        }
        for(int i=3; i>=0; i--){
            for(int j=0; j<4-i; j++)
                System.out.print("  ");
            System.out.print("* ");
            for(int j=1; j<i*2; j++)
                System.out.print("  ");
            System.out.print(i==0?"":"*");
            System.out.println();
        }
    }
}
