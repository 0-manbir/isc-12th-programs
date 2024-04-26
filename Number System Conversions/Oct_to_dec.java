import java.util.Scanner;

class Oct_to_dec
{
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String input = s.next();
        String[] list = input.split("\\.");
        int index=0;
        long sum=0;
        double sumDec=0;
        
        for(int i=list[0].length()-1; i>=0; i--){
            sum += Integer.parseInt(""+list[0].charAt(index)) * Math.pow(8,i);
            index++;
        }
        
        if(list.length == 2){
            
            for(int i=0; i<list[1].length(); i++){
                sumDec += Integer.parseInt(""+list[1].charAt(i)) * Math.pow(8,-(i+1));
            }
            System.out.println(sum+sumDec);
        }else
            System.out.println(sum);
    }
}