import java.util.Scanner;

public class Potential
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine().toUpperCase();
        String[] arr = str.split("[ .?]+");
        int[] arrP = new int[arr.length];
        
        // calculate the potential of each word in array 'arr' and store it in the same index in arrP | print all words with corr. potential
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            
            for(int j=0; j<arr[i].length(); j++)
                sum += arr[i].charAt(j)-64;
                
            arrP[i] = sum;
            System.out.println(arr[i] + "\t=\t" + sum);
        }
        
        // sort both arrays in ascending order of 'arrP'
        int tempI;
        String tempS;
        for(int i=0; i<arrP.length; i++)
            for(int j=1; j<arrP.length-i; j++)
                if(arrP[j-1] > arrP[j])
                {
                    // switch elements of arr
                    tempS = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tempS;
                    // switch elements of arrP
                    tempI = arrP[j-1];
                    arrP[j-1] = arrP[j];
                    arrP[j] = tempI;
                }
                
        System.out.println("Arranged string: ");
        for(String word : arr)
            System.out.print(word + " ");
    }
}