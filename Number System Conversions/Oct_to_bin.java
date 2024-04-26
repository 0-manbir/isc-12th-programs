import java.util.*;

class Oct_to_bin
{
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String binNum="", binDec="", input=s.next();
        String[] list = input.split("\\.");
        String[] binEq={"000","001","010","011","100","101","110","111"};
        
        for(int i=0; i<list[0].length(); i++){
            binNum += binEq[Integer.parseInt(""+list[0].charAt(i))];
        }
        
        if(list.length == 2){
            for(int i=0; i<list[1].length(); i++){
                binDec += binEq[Integer.parseInt(""+list[1].charAt(i))];
            }
        }
        System.out.println((list.length==2)?(binNum+"."+binDec):(binNum));
    }
}