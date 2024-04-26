import java.util.Scanner;

public class Vowel_count_24
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp = s.nextLine(), inp1="";
        
        inp1 += Character.toUpperCase(inp.charAt(0));
        
        for(int i=1; i<inp.length(); i++)
        {
            if(inp.charAt(i)==' '){
                inp1 += " " + Character.toUpperCase(inp.charAt(i+1));
                i++;
            }else
                inp1 += inp.charAt(i);
        }
        System.out.println("\n"+inp1+"\n");
        
        System.out.println("Word           Vowels         Consonants     ");
        
        inp1 += ' ';
        int t=0;
        for(int i=0; i<inp1.length(); i++){
            if(inp1.charAt(i) == ' '){
                Count(inp1.substring(t, i));
                t = i+1;
            }
        }
    }
    
    public static void Count(String word){
        System.out.print(word);
        for(int i=0; i<15-word.length(); i++)
            System.out.print(" ");
        
        int v=0,c=0;
        for(int i=0; i<word.length(); i++){
            char ch = Character.toUpperCase(word.charAt(i));
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
            else
                c++;
        }
        System.out.print("  "+v+"                 "+c);
        System.out.println();
    }
}
