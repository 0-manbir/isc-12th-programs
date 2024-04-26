import java.util.Scanner;

public class Reverse_case
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine(), out="";
        
        for(int i=0; i<in.length(); i++){
            if(Character.isLowerCase(in.charAt(i)))
                out += Character.toUpperCase(in.charAt(i));
            else
                out += Character.toLowerCase(in.charAt(i));
        }
        System.out.println(out);
    }
}
