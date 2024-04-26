import java.util.Scanner;

public class pattern7
{
    static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Length: ");
        int l = s.nextInt();
        System.out.println("Width: ");
        int b = s.nextInt();
        System.out.println("Character: ");
        String ch = s.next();
        
        for(int i=0; i<l; i++){
            System.out.print(ch+"  ");
            for(int j=0; j<b-2; j++)
                if(i==0||i==l-1)
                    System.out.print(ch+"  ");
                else
                    for(int k=0; k<ch.length()+2; k++)
                        System.out.print(" ");
            System.out.print(ch+"\n");
        }
    }
}
