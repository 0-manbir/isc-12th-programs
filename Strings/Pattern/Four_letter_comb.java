/*
    Program: 7
    
        Write a program in Java to accept a four-letter word.
        Display all the possible combinations, such that no letter should repeat.
        
        Sample: PARK
                PAKR, PKAR, PRAK, APRK, ARPK, ... and so on.
 */

import java.util.Scanner;

public class Four_letter_comb
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a four-letter word: ");
        String str = s.next();
        
        //lol
        for(int i=0; i<str.length(); i++)
            for(int j=0; j<str.length(); j++)
                for(int k=0; k<str.length(); k++)
                    for(int l=0; l<str.length(); l++)
                        if(i!=j && j!=k && k!=l && l!=i && i!=k && j!=l)
                            System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k)+""+str.charAt(l)+", ");
    }
}