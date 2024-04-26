import java.util.Scanner;

public class Piglatin
{
    static void main()
    {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int index=0;
        
        for(int i=0; i<in.length(); i++){
            char ch = in.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                index = i;
                break;
            }
        }
        System.out.println(in.substring(index,in.length()) + in.substring(0,index) + "ay");
    }
}
