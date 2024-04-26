import java.util.*;

class Dec_to_bin
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
            rem=num%2;
            number.add(rem);
            num/=2;
        }
        
        for(int i=number.size()-1; i>=0; i--){
            System.out.print(number.get(i));
        }
        System.out.print((decimal!="")?("."):(""));
        
        if(decimal!=""){
            double val = Double.parseDouble(decimal);
            boolean stop = false;
            //for(int i=1; i<=4; i++){
            while(val>0){
                val*=2;
                if(val>=1){
                    val-=1;
                    numberDec.add(1);
                    if(val==0)
                        break;
                }else{
                    numberDec.add(0);
                }
            }
            //}
        }
        
        for(int i=0; i<numberDec.size(); i++){
            System.out.print(numberDec.get(i));
        }
    }
}