import java.util.Arrays;
import java.util.Scanner;

public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 6 elements: ");
            
        int[] inp = new int[6];
        for(int i=0; i<6; i++)
            inp[i] = s.nextInt();
        
        for(int i=6; i>0; i--)
        {
            for(int j=0; j<i; j++)
                System.out.print(inp[j] + "   ");
            System.out.println();
            
            for(int j=0; j<i-1; j++)
                inp[j] = inp[j+1]-inp[j];
        }
    }
}