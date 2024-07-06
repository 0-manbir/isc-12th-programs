/*
    Program 10:
        
        write a program in java to input n number of sentences, and print each sentence by reversing the words.
        individual words are not reversed.
        
        sample: Do not judge a book by its cover.
                > cover its by book a judge not Do.
 */

import java.util.Scanner;

public class Reverse_sentence
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int n = s.nextInt();
        String[] arr = new String[n];
        s.nextLine();
        
        for(int i=0; i<arr.length; i++)
            arr[i] = s.nextLine();
            
        for(String str : arr)
        {
            String[] arr1 = str.split("[ .?!]+");
            
            for(int i=arr1.length-1; i>=0; i--)
                System.out.print(arr1[i] + " ");
                
            System.out.println();
        }
    }
}