import java.util.Scanner;

public class Happy_word_21
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inp = s.next().toUpperCase(), digit_str="";
        boolean happy_word = false;
        
        for(int i=0; i<inp.length(); i++){
            char ch = inp.charAt(i);
            digit_str += (int)ch - (int)'A' + 1;
        }
        int digits = Integer.parseInt(digit_str);
        
        System.out.println(digits);
        
        while(digits>1){
            int sum = 0;
            while(digits>0){
                sum += Math.pow(digits%10, 2);
                digits/=10;
            }
            if(sum==1){
                happy_word = true;
                break;
            }
            digits = sum;
        }
        System.out.println(happy_word?"A Happy Word :)":"Not A Happy Word.");
    }
}
