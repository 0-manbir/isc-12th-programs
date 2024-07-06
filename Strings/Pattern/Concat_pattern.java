/*
    Program: 6
        
        Write a program in Java to accept two strings.
        Display the new string by taking each chars of the first string
        from left to right, and of the second string from right to left.
        
        Sample: HISTORY, SCIENCE
                HEICSNTEORICYS
 */

import java.util.Scanner;

public class Concat_pattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String str1 = s.next(), str2 = s.next(), str = "";
        
        for(int i=0; i<str1.length(); i++) {
            str += (char) str1.charAt(i);
            str += (char) str2.charAt(str1.length()-1-i);
        }
        
        System.out.println(str);
    }
}