/*
    Program: 2
    
        Write a program in Java to enter a mixed case.
        Arrange all the letters of string such that all the lower 
        case characters are followed by the upper case characters.
        
        Sample: Computer Science
                omputercienceCS
 */

import java.util.Scanner;

public class Arrange_letters
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = s.nextLine();
        String str_u="", str_l="";
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch >= 97 && ch <= 122)
                str_l += ch;
            else if(ch >= 65 && ch <= 90)
                str_u += ch;
        }
        
        System.out.println(str_l + str_u);
    }
}