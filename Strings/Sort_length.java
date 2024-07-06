/*
    Program 12
    
        write a program in java to accept a sentence.
        arrange the words in ascending order of their length. 
        if two or more words are of the same length, sort them alphabetically.

        sample: AS YOU SOW SO SHALL YOU REAP
                > AS SO SOW YOU YOU REAP SHALL
 */

import java.util.*;

public class Sort_length
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine().toUpperCase();
        String[] arr = str.split("[ .]+");
        
        
        for(int i=0; i<arr.length-1; i++)
            for(int j=0; j<arr.length-i-1; j++)
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
                
        for(int i=1; i<=str.length(); i++)
            for(String word : arr)
                if(word.length() == i)
                    System.out.print(word +  " ");
    }
}