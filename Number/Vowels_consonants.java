import java.util.*;

class Vowels_consonants
{
    public static void main(String[]a){
        Scanner s = new Scanner (System.in);
        String alph = s.next();
        List<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        System.out.println((vowels.contains(alph))?("vowel"):("consonant"));
    }
}