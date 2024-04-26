public class Pattern_25c
{
    public static void main()
    {
        int a = 97;
        for(int i=4; i>=0; i--){
            for(int j=1; j<=i; j++)
                System.out.print("  ");
            for(int j=0; j<5-i; j++){
                System.out.print((char)a + "   ");
                a++;
            }
            System.out.println();
        }
        
        int b=103, t=7;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++)
                System.out.print("  ");
            for(int j=5-i; j>0; j--){
                System.out.print((char)b + "   ");
                b++;
            }
            System.out.println();
            b-=t;
            t-=2;
        }
    }
}
