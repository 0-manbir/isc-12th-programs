/*
    Program: 8
    
        Write a program in Java to eliminate multiple blanks between the words
        by a single blank
        
        Sample: Indian   Cricket  team  tour   to   Australia
                Indian Cricket team tour to Australia
 */

import java.util.Scanner;

public class Remove_spaces
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = s.nextLine(), str1="";
        boolean addSpace = true;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                if(addSpace)
                {
                    str1 += " ";
                    addSpace = false;
                }
            }
            else
            {
                str1 += str.charAt(i);
                addSpace = true;
            }
        }
        
        System.out.println(str1);
    }
}