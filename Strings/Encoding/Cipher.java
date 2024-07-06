/*
    Program: 15
    
        Write a program to accept a plain text fo length L,
        where L must be greater than 3 and less than 100.
        Encrypt the text if valid as per the Caesar Cipher.
        
        Sample: Hello! How are you?
                > Urryb! Ubj ner lbh?
 */

import java.util.Scanner;

public class Cipher
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine(), str1="";
        
        if(str.length() < 3 || str.length() >= 100){
            System.out.println("Invalid length!");
            return;
        }
        
        for(int i=0; i<str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            if(Character.isLetter(ch))
            {
                if(Character.isLetter((char)(ch+13)))
                    str1 += (char)(ch+13);
                else if(Character.isLetter((char)(ch-13)))
                    str1 += (char)(ch-13);
                else
                    str1 += ch;
            }
            else
                str1 += ch;
        }
        
        System.out.println("The Cipher Text is: " + str1);
    }
}