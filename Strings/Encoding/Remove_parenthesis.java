/*
    Program: 13
    
        Write a program to:
            Read a string and convert in capitals
            Check the validity of the given string
            If the string is valid, output it wihtout the portion enclosed in brackets
            If the string is not valid, output "Invalid!".

        Sample: SUN (a) RISE BEGINS FROM (RT) EAST
                > SUN RISE BEGINS FROM EAST
                
                SUN (A(X) RISE) BEGINS FROM (RT) EAST
                > Invalid!
 */

import java.util.Scanner;

public class Remove_parenthesis
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = s.nextLine().toUpperCase(), str1="";
        boolean a=false;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(') {
                if(a) {
                    System.out.println("Invalid!");
                    return;
                }
                a = true;
            }
            else if(str.charAt(i) == ')'){
                a = false;
                i++;
            }
            else
                if(!a)
                    str1 += str.charAt(i);
        }
        
        System.out.println(str1);
    }
}