import java.util.Scanner;

public class difference
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[] list = new int[6];
        for(int i=0; i<6; i++)
            list[i] = s.nextInt();
        for(int i:list)
            System.out.print(i+"  ");
        System.out.println();
        for(int i=5; i>0; i--)
        {
            for(int j=0; j<i; j++)
                list[j] = list[j+1] - list[j];
            for(int j=0; j<i; j++)
                System.out.print(list[j]+"  ");
            System.out.println();
        }
    }
}
