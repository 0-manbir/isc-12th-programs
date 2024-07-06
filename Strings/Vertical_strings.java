/*
    Program: 5 (extra)
    
        the names of the teams participating in a competition should be displayed on a banner vertically
        to accomodate as many teams as possible in a single banner. design a program to accept the names
        of N teams where 2 < N < 9 and display them in vertical order side by side with a horizontal tab.
        
        sample: 3, Emus, Road Rols, Coyote
                > E     R      C
                  m     o      o
                  u     a      y
                  s     d      o
                               t
                        R      e
                        o
                        l
                        s
 */

import java.util.Scanner;

public class Vertical_strings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of teams: ");
        int n = s.nextInt();
        s.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++)
            arr[i] = s.nextLine();
            
        int maxLength = 0;
        for(String w : arr)
            if(w.length() > maxLength)
                maxLength = w.length();
                
        for(int i=0; i<maxLength; i++)
        {
            for(String w : arr)
                if(w.length()-1 >= i)
                    System.out.print(w.charAt(i) + "\t");
                else
                    System.out.print("\t");
            
            System.out.println();
        }
    }
}