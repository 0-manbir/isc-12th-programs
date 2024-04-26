import java.util.Scanner;

public class reversed_words
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String in = " "+s.nextLine();
        
        while(in.length()>0){
            int index = in.lastIndexOf(" ");
            System.out.print(in.substring(index+1,in.length()) + " ");
            in = in.substring(0,index);
        }
    }
}
