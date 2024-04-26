import java.util.Scanner;

public class penultimate
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        
        int i2 = in.lastIndexOf(" ");
        int i1= in.substring(0,i2).lastIndexOf(" ") + 1;
        
        System.out.print(in.substring(i1,i2));
    }
}
