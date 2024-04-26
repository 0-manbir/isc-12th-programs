import java.util.Scanner;
import java.util.Arrays;

public class Arrange_elements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 11 elements: ");
        
        int[] inp = new int[11];
        int[] arranged = new int[11];
        
        for(int i=0; i<11; i++)
            inp[i] = s.nextInt();
        Arrays.sort(inp);
        
        int index1=4, index2=6, index_inp=10;
        boolean left = true;
        
        arranged[5] = inp[index_inp];
        while(true)
        {
            index_inp--;
            
            if(left){
                arranged[index1] = inp[index_inp];
                index1--;
            }else{
                arranged[index2] = inp[index_inp];
                index2++;
            }
            left = !left;
            
            if(index_inp==0)
                break;
        }
        
        for(int i=0; i<11; i++)
            System.out.print((i==10)?arranged[i]:(arranged[i]+", "));
    }
}