import java.util.Scanner;

public class Reverse_sentence_19
{
    public static void main(){
        Scanner s = new Scanner(System.in);
        String in = " "+s.nextLine(), str=in;
        
        while(in.length()>0){
            int index = in.lastIndexOf(" ");
            String word = in.substring(index+1,in.length());
            for(int i=0; i<word.length(); i++){
                int ascii = (int)word.charAt(i);
                if(!(ascii<65 || ascii>122 || (ascii>90 && ascii<97))){
                    System.out.print((char)ascii);
                }
            }
            System.out.print(" ");
            in = in.substring(0,index);
        }
    }
}
