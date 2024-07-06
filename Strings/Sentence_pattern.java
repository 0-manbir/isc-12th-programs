/*
    Program: 3 (Extra)
    
        input a sentence and count the number of words beginning and ending with a vowel.
        also add these words in a new string, and concatenate it with the remaining words.
        
        Sample: ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE
                3, ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL
 */

import java.util.Scanner;

public class Sentence_pattern
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine(), words="", out="";
        int c = 0;
        String[] arr = str.split("[ .]+");
        
        for(String w : arr)
        {
            if(isVowel(w.charAt(0)) && isVowel(w.charAt(w.length()-1))){
                words += w + " ";
                c++;
            }else
                out += w + " ";
        }
        
        System.out.println("Frequency: " + c);
        System.out.println(words + out);
    }
    
    private static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}