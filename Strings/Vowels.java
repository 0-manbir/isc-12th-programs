/*
    Program: 1 (Extra)
    
        Write a program in java to input a word in upper case and replace each vowel with the next one.
        a > e, e > i, i > o, o > u, u > a
        
        Sample input: COMPUTER
                      CUMPATIR
 */

import java.util.Scanner;

public class Vowels
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = s.next().toUpperCase(), out="";
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            switch(ch) {
                case 'A':
                    out += 'E'; break;
                case 'E':
                    out += 'I'; break;
                case 'I':
                    out += 'O'; break;
                case 'O':
                    out += 'U'; break;
                case 'U':
                    out += 'A'; break;
                default:
                    out += ch;
            }
        }
        
        System.out.println(out);
    }
}