/*
    Program: 4 (extra)
    
        write a program to accept a sentence which may be terminated by either ' ', '?', or '.'
        convert the non palindrome words of the sentence into palindrome by concatenating the word by its reverse.
        
        sample: THE BIRD IS FLYING
                THEHT BIRDRIB ISI FLYINGNIYLF
 */

import java.util.Scanner;

public class Non_palindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine().toUpperCase(), out="";
        String[] arr = str.split("[ .?]+");
        
        for(String word : arr)
            out += word + reverse(word) + " ";
            
        System.out.println(out);
    }
    
    private static String reverse(String word)
    {
        String out = "";
        for(int i=word.length()-2; i>=0; i--)
            out += word.charAt(i);
        return out;
    }
}