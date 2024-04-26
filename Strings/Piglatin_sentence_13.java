import java.util.Scanner;

public class Piglatin_sentence_13
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp = s.nextLine()+" ", word;
        int index=0;
        
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i)==' '){
                word = inp.substring(index, i);
                System.out.print(piglatin(word));
                index = i+1;
            }
        }
    }
    
    static String piglatin(String word)
    {
        int index=0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                index = i;
                break;
            }
        }
        return(word.substring(index,word.length())+word.substring(0,index)+"ay ");
    }
}
