import java.util.Scanner;

public class freq_palin
{
    static int c=0;
    static void main()
    {
        c=0;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toUpperCase()+" ", word="";
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' '){
                palin(word);
                word="";
            }else
                word+=str.charAt(i);
        }
        System.out.println("Number of palindrome words: "+c);
    }
    
    static void palin(String word)
    {
        String rev="";
        for(int i=word.length()-1; i>=0; i--)
            rev+=word.charAt(i);
        
        if(rev.equals(word))
            c++;
    }
}
