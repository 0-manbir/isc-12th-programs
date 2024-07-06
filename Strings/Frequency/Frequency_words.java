/*
    Program 12
    
        write a program to read a sentence and output the number of times each word occurs.
        at the end, the output must be sorted into ascending order words along with usage.
        assume that entire sentence is in upper case.
        
        Sample: IF YOU FAIL TO PLAN YOU ARE PLANNING TO FAIL.
                > Are     1             Planning    1
                  Fail    2             To          2
                  If      1             You         2
                  Plan    1
 */

import java.util.*;

public class Frequency_words
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine().toUpperCase();
        String[] arr = str.split("[ .]+");
        
        
        for(int i=0;i<arr.length-1;i++)
            for(int j=0; j<arr.length-i-1; j++)
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            
        
        int count = 1;
        
        for(int i=0; i<arr.length; i++)
        {
            if(i<arr.length-1 && arr[i].equals(arr[i+1]))
                count++;
            else{
                System.out.println(arr[i] + "\t" + count);
                count = 1;
            }
        }
    }
}