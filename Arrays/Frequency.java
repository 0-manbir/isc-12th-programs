import java.util.Scanner;

public class Frequency
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int length = 10, temp;
        int[] arr = new int[length];
        for(int i=0; i<length; i++)
            arr[i] = s.nextInt();
            
        for(int i=0; i<length; i++)
            for(int j=1; j < (length-i); j++)
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }
        
        for(int i=0; i<length;)
        {
            int freq = 1;
            
            for(int j=i+1; j<length; j++)
                if(arr[j] == arr[i])
                    freq++;
            
            System.out.println("=> " + arr[i] + "\t" + freq);
            i+=freq;
        }
    }
}