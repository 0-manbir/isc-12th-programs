import java.util.*;

class Dec_to_hex
{
    static void main(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(), rem=0;
        String val;
        List<Integer> number = new ArrayList<Integer>();
            
        while(num>0){
            rem=num%16;
            number.add(rem);
            num/=16;
        }
        
        for(int i=number.size()-1; i>=0; i--){
            val = number.get(i).toString();
            switch(val){
                case "10": val="A"; break;
                case "11": val="B"; break;
                case "12": val="C"; break;
                case "13": val="D"; break;
                case "14": val="E"; break;
                case "15": val="F"; break;
            }
            System.out.print(val);
        }
    }
}