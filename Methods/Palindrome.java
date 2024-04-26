public class Palindrome
{
    public static void main(int input)
    {
        String n = Integer.toString(input);
        
        if(palin(n)==1)
            System.out.println(n+" is a palindrome number.");
        else
            System.out.println(n+" is not a palindrome number.");
    }
    
    static int palin(String word)
    {
        String wordRev = "";
        for(int i=word.length()-1; i>=0; i--)
            wordRev += word.charAt(i);
        
        if(word.equals(wordRev))
            return 1;
        else 
            return 0;
    }
}
