import java.util.Scanner;

public class Denomination
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int n = s.nextInt();
        
        // calculating the length of the integer
        int length = 0;
        int n1 = n;
        while(n1>0)
        {
            n1 /= 10;
            length++;
        }
            
            
        // storing each digit of the int in an array
        int[] arr = new int[length];
        int index = length-1;
        n1 = n;
        while(n1>0)
        {
            arr[index--] = n1%10;
            n1 /= 10;
        }
        

        // storing the string equivalent of each digit
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String out = "";
        for(int a : arr)
            out += numbers[a] + " ";
            
        System.out.println(out + "\nDenominations: ");
        
        
        // list of all available elements for denomination
        int[] list = {2000, 500, 200, 100, 20, 10, 1};
        n1 = n;
        
        for(int i=0; i<list.length; i++)
        {
            int count = 0;
            
            while(list[i] <= n1)
            {
                n1 -= list[i];
                count++;
            }
            
            if(count!=0)
                System.out.println(list[i] + "\t*\t" + count + "\t=\t" + (list[i]*count));
        }
    }
}