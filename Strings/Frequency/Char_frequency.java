/*
    Program: 4
    
        write a program in java to accept a string.
        count and display the frequency of each character present in the string.
        the character with multiple frequencies should be displayed only once.
        
        Sample: golden jubilee
                > g-1       d-1     j-1     i-1
                  o-1       e-3     u-1
                  l-2       n-1     b-1
 */

import java.util.Scanner;

public class Char_frequency
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean[] checked = new boolean[128];
        
        for(int i=0; i<str.length(); i++)
        {
            int count = 0;
            char ch = str.charAt(i);
            
            if(!checked[ch] && ch!=' ')
            {
                checked[ch] = true;
                
                for(int j=0; j<str.length(); j++)
                    if(str.charAt(j) == ch)
                        count ++;
                
                System.out.println(ch + " => " + count);
            }
        }
    }
}
