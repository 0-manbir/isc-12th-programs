/*
    Program: 5
    
        Write a program in java to accept a string and disply the new string by reversing chars of each word.
        
        Sample: Understanding Computer Science
                > gnidnatsrednU retupmoC ecneicS
 */

import java.util.Scanner;

public class Reverse_word
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = s.nextLine()+" ", str1="", out="";
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' '){
                for(int j=str1.length()-1; j>=0; j--)
                    out += str1.charAt(j);
                out += " ";
                str1 = "";
            }
            else
                str1 += str.charAt(i);
        }
        
        System.out.println(out);
    }
}