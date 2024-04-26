import java.util.Scanner;

class Hex_to_dec
{
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a hexa-decimal number: ");
        String input = s.next();
        String[] list = input.split("\\.");
        int index=0;
        long sum=0;
        double sumDec=0;
        
        for(int i=list[0].length()-1; i>=0; i--){
            String abc = (""+list[0].charAt(index)).toLowerCase();
            switch(abc){
                case "a": abc="10"; break;
                case "b": abc="11"; break;
                case "c": abc="12"; break;
                case "d": abc="13"; break;
                case "e": abc="14"; break;
                case "f": abc="15"; break;
            }
            sum += Integer.parseInt(abc) * Math.pow(16,i);
            index++;
        }
        
        if(list.length == 2){
            
            for(int i=0; i<list[1].length(); i++){
                sumDec += Integer.parseInt(""+list[1].charAt(i)) * Math.pow(16,-(i+1));
            }
            System.out.println(sum+sumDec);
        }else
            System.out.println(sum);
    }
}