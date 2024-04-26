import java.util.Scanner;

public class Freq_vowel
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String word = s.nextLine();
        freq(word);
    }
    
    static void freq(String inp)
    {
        int a=0, e=0, i=0, o=0, u=0;
        
        for(int j=0; j<inp.length(); j++)
        {
            char c = inp.charAt(j);
            if(c=='a' || c=='A')
                a++;
            else if(c=='e' || c=='E')
                e++;
            else if(c=='i' || c=='I')
                i++;
            else if(c=='o' || c=='O')
                o++;
            else if(c=='u' || c=='U')
                u++;
        }
        
        System.out.println("Frequency of a or A: "+a+
                            "\nFrequency of e or E: "+e+
                            "\nFrequency of i or I: "+i+
                            "\nFrequency of o or O: "+o+
                            "\nFrequency of u or U: "+u);
    }
}
