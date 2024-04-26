import java.util.Scanner;

public class Swap
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[][] list = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[i].length; j++)
                System.out.print(list[i][j] + "  ");
            System.out.println();
        }
        
        for(int i=0; i<4; i++)
        {
            int temp = list[0][i];
            list[0][i] = list[3][i];
            list[3][i] = temp;
        }
        
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[i].length; j++)
                System.out.print(list[i][j] + "  ");
            System.out.println();
        }
    }
}