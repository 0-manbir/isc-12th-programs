import java.util.Arrays;
import java.util.Scanner;

public class Delete_index 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
            
        int[] inp = new int[10];
        int[] arranged = new int[9];
            
        for(int i=0; i<10; i++)
            inp[i] = s.nextInt();
        System.out.println("Enter the index to be deleted: ");
        int index = s.nextInt();
        
        for(int i=0; i<=index; i++)
            arranged[i] = inp[i];
        for(int i=index; i<9; i++)
            arranged[i] = inp[i+1];
        
        Arrays.sort(arranged);
        for(int i=0; i<9; i++)
            System.out.print((i==8)?arranged[i]:(arranged[i]+", "));
    }
}