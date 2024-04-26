import java.util.*;

class Dec_to_oct
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String[] list = input.split("\\.");
        int num=Integer.parseInt(list[0]), rem=0;
        String decimal = (list.length==2)?("0."+list[1]):("");
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> numberDec = new ArrayList<Integer>();
            
        while(num>0){
            rem=num%8;
            number.add(rem);
            num/=8;
        }
        
        for(int i=number.size()-1; i>=0; i--){
            System.out.print(number.get(i));
        }
        System.out.print((decimal!="")?("."):(""));
        
        if(decimal!=""){
            double val = Double.parseDouble(decimal);
            boolean stop = false;
            for(int i=1; i<=4; i++){
                val*=8;
                if(val<=8){
                    int num1 = Integer.parseInt(Double.toString(val).split("\\.")[0]);
                    val = val - num1;
                    numberDec.add(num1);
                    if(val==0)
                        break;
                }else{
                    numberDec.add(0);
                }
            }
        }
        
        for(int i=0; i<numberDec.size(); i++){
            System.out.print(numberDec.get(i));
        }
    }
}