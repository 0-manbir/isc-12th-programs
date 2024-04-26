import java.util.Scanner;

public class Highest
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[][] list = new int[4][4];
        
        for(int i=0; i<4; i++){
            System.out.println("\n\nRow: "+(i+1) + "  ");
            for(int j=0; j<4; j++){
                System.out.print("Column: "+(j+1) + "  ");
                list[i][j] = s.nextInt();
            }
        }
        int highest;
        for(int i=0; i<4; i++)
        {
            highest = list[i][0];
            for(int j=1; j<4; j++)
                if(list[i][j] > highest)
                    highest = list[i][j];
            
            System.out.println("Highest value of row "+i+": "+highest);
        }
    }
}
