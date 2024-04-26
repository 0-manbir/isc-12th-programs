public class pattern6
{
    static void main()
    {
        int ch=97;
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<5-i; j++)
                System.out.print("  ");
            for(int j=0; j<i; j++){
                System.out.print((char)ch+"   ");
                ch++;
            }
            System.out.println();
        }
        
        ch=103;
        for(int i=4; i>0; i--)
        {
            for(int j=0; j<5-i; j++)
                System.out.print("  ");
            for(int j=0; j<i; j++){
                System.out.print((char)ch+"   ");
                ch++;
            }
            System.out.println();
            ch -= 2*i-1;
        }
    }
}
