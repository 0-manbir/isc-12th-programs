/*
    Program: 1
    
        Input a string, and output the character with:
            (1) highest ASCII code (lower case)
            (2) lowest ASCII code (lower case)
            (3) highest ASCII code (upper case)
            (4) lowest ASCII code (upper case)
 */

import java.util.Scanner;

public class Ascii_code
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char lh='a', ll='z', uh='A', ul='Z';
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch>=65 && ch<=90)
            {
                if(ch>uh)
                    uh = ch;
                else if(ch<ul)
                    ul = ch;
            }
            else if(ch>=97 && ch <=122)
            {
                if(ch>lh)
                    lh = ch;
                else if(ch<ll)
                    ll = ch;
            }
        }
        
        System.out.println("The character with lowest ASCII code in upper case: " + ul);
        System.out.println("The character with highest ASCII code in upper case: " + uh);
        System.out.println("The character with lowest ASCII code in lower case: " + ll);
        System.out.println("The character with highest ASCII code in lower case: " + lh);
    }
}