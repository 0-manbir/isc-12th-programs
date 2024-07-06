/*
    Program 12
    
        write a program in java to accept a sentence.
        output the number of words in the sentence
        arrange the words in ascending order of their frequency in the sentence.
        if two or more words are of the same length, arrange them in any order.

        sample: TO BE OR NOT TO BE
                > total words: 6
                  word    frequency
                  OR      1
                  NOT     1
                  TO      2
                  BE      2
 */

import java.util.Scanner;

public class Sort_frequency
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine().toUpperCase();
        String[] arr = str.split("[ .]+");
        
        System.out.println("Word\t\tFrequency");
                        
        for(int i=1; i<=str.length(); i++)
            for(String word : arr)
                if(frequency(word, arr, false) == i)
                {
                    System.out.println(word + "\t\t" + i);                    
                    frequency(word, arr, true);
                }
    }
    
    private static int frequency(String word, String[] arr, boolean delete)
    {
        int out = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]!=null && arr[i].equals(word))
            {
                if(delete) 
                    arr[i] = null;
                out++;
            }
        return out;
    }
}