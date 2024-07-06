/*
    Program: 9
    
        Write a program to input a code and its length.
        At the first instance of an error display 'Invalid' stating the reason.
        In case of no error, display the message 'Valid'.
        
        Sample: 4, AcIK
                > Invalid! Only uppercase letters permitted!
                
                4, ABCE
                > Invalid! Only alternate letters permitted!
                
                3, ACE
                > Valid!
 */

import java.util.Scanner;

public class Validity
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the code: ");
        int n = s.nextInt();
        
        if(n > 6){
            System.out.println("Invalid! Length of String should not exceed 6 characters!");
            return;
        }
        
        System.out.println("Enter the code: ");
        String str = s.next();
        
        boolean[] li = new boolean[11];
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == Character.toLowerCase(ch)){
                System.out.println("Invalid! Only uppercase letters permitted!");
                return;
            }
            
            if(ch=='A' || ch=='C' || ch=='E' || ch=='G' || ch=='I' || ch=='K'){
                if(li[ch-65]){
                    System.out.println("Invalid! No repetition of letters!");
                    return;
                }
                
                li[ch-65] = true;
            }
            else {
                System.out.println("Invalid! Only alternate letters permitted!");
                return;
            }
        }
        
        System.out.println("Valid!");
    }
}