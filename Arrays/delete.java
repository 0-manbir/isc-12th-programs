import java.util.Arrays;
import java.util.Scanner;

class delete
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++)
            list[i] = s.nextInt();
        System.out.println("Enter the index to delete: ");
        int i = s.nextInt(), count=0;
        int[] li = new int[9];
        
        for(int j=0; j<9; j++){
            if(i==j)continue;
            li[count++] = list[j];
        }
        Arrays.sort(li);
        
        for(int j:li)
            System.out.print(j+"   ");
    }
}
