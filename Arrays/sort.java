import java.util.Scanner;
import java.util.Arrays;

public class sort
{
    public static void main(){
        int[] list = new int[9];
        Scanner s= new Scanner(System.in);
        for(int i=0; i<9; i++)
            list[i] = s.nextInt();
        Arrays.sort(list);
        int[] sort = new int[9];
        sort[4] = list[8];
        boolean left = true;
        int l=3, r=5, count=7;
        
        while(count>=0)
        {
            if(left){
                sort[l] = list[count];
                l--;
                left = false;
            }else{
                sort[r] = list[count];
                r++;
                left = true;
            }
            count--;
        }
        
        for(int i:sort)
            System.out.print(i+"   ");
    }
}
