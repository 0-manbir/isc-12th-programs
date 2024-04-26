import java.util.Scanner;

public class Freq_palindrome_3
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        StringBuffer inp = new StringBuffer(), word = new StringBuffer();
        int count = 0;
        inp.append(s.nextLine());
        
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i)==' '){
                if(word==word.reverse()){
                    count++;
                    word.delete(0,word.length());
                }
            }else
                word.append(inp.charAt(i));
        }
        System.out.println("No of palindrome words: "+count);
    }
}
