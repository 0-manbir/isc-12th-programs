/*
    Program: 3
    
        Write a program in Java to accept a string. Arrange all the letters of the string in an alphabetical order.
        Now, insert the missing letters in the sorted string to complete all the letters between first and last chars.
        
        Sample: computer
                > cemoprtu
                > cdefghijklmnopqrstu
 */

import java.util.Scanner;

public class Ascending_chars
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = s.next(), str1="";
        
        for(int i=97; i<=122; i++)
            for(int j=0; j<str.length(); j++)
                if(str.charAt(j) == i)
                    str1 += (char)i;
                    
        System.out.print("Arranged String: " + str1 + "\nMissing Letters: ");
        
        for(int i=str1.charAt(0); i<=str1.charAt(str1.length()-1); i++)
            System.out.print((char)i);
    }
}