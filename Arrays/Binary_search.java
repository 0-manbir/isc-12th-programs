import java.util.Scanner;

public class Binary_search
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[] list = new int[20];
        boolean f = false;
        
        System.out.println("Enter 20 numbers:");
        for(int i=0; i<20; i++)
            list[i] = s.nextInt();
        
        System.out.println("Enter the number to be searched:");
        int n = s.nextInt(), lb=0, ub=19, mid;
        
        while(ub>=lb)
        {
            mid = (lb+ub)/2;
            int val = list[mid];
            
            if(n==val){
                f=true;
                break;
            }else if(n>val)
                lb = mid + 1;
            else
                ub = mid - 1;
        }
        
        if(f){
            System.out.print(n+" found in the list. It is a ");
            if(n>0)
                System.out.print("positive ");
            else
                System.out.print("negative ");
            
            if(n%2==0)
                System.out.print("even number.");
            else
                System.out.print("odd number.");
        }else
            System.out.println(n+" not found in the list.");
    }
}
