import java.util.Scanner;

public class Remove_repeated
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String in = s.next(), in1="";
        boolean print;
        
        for(int i=0; i<in.length(); i++){
            char ch = in.charAt(i);
            print=true;
            
            for(int j=0; j<in1.length(); j++){
                if(ch==in1.charAt(j))
                    print=false;
            }
            
            if(print)
                in1+=ch;
        }
        
        System.out.println(in1);
    }
}
