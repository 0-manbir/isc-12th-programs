import java.util.Scanner;

public class Encoding
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String in = s.next(), out="";
        
        for(int i=0; i<in.length(); i++){
            char ch = in.charAt(i);
            
            if((ch>='a'&&ch<='y') || (ch>='A'&&ch<='Y')){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    out += (char)(ch+2);
                else
                    out += (char)(ch+1);
            }else
                out += (Character.isUpperCase(ch)?('A'):('a'));
        }
        
        System.out.println(out);
    }
}
