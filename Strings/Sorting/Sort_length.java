/*
    Program: 11
    
    read a single sentence which terminates with a full stop.
    the words are to be seperated by a single blank space and are in lower case.
    arrange the words contained in the sentence acc to the length of the words in ascending order.
    if two words are of the same lengt, then the word occurring first in the input should come first.
    for both input and output, the sentence must begin in upper case.
    
    Sample: Print the sentence in ascending order.
            In the sentence print order sentence ascending.
 */

import java.util.Scanner;

public class Sort_length
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = s.nextLine();
        String str = Character.toLowerCase(input.charAt(0)) + input.substring(1);
        String[] arr = str.split("[ .]+");
        String out = "";
        
        for(int i=1; i<str.length(); i++)
            for(String w : arr)
                if(w.length() == i)
                    out += w + " ";
                    
        out = Character.toUpperCase(out.charAt(0)) + out.trim().substring(1) + ".";
        System.out.println(out);
    }
}