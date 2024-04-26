import java.util.*;

class Hex_to_bin
{
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a hexa-decimal number: ");
        String binNum="", binDec="", input=s.next(), index="", index1="";
        String[] list = input.split("\\.");
        String[] binEq={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        
        for(int i=0; i<list[0].length(); i++){
            index = ""+list[0].toLowerCase().charAt(i);
            switch(index){
                case "a": index="10"; break;
                case "b": index="11"; break;
                case "c": index="12"; break;
                case "d": index="13"; break;
                case "e": index="14"; break;
                case "f": index="15"; break;
            }
            binNum += binEq[Integer.parseInt(index)];
        }
        
        if(list.length == 2){
            for(int i=0; i<list[1].length(); i++){
                
                index1 = ""+list[1].toLowerCase().charAt(i);
                switch(index1){
                    case "a": index1="10"; break;
                    case "b": index1="11"; break;
                    case "c": index1="12"; break;
                    case "d": index1="13"; break;
                    case "e": index1="14"; break;
                    case "f": index1="15"; break;
                }
                
                binDec += binEq[Integer.parseInt(index)];
            }
        }
        
        System.out.println((list.length==2)?(binNum+"."+binDec):(binNum));
    }
}