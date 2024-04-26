import java.util.*;

class Prime_num
{
    static void main(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(), number=num;
        boolean prime = true;
        
        for(int i=2; i<num; i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        
        System.out.println((prime)?(number+" is a prime number."):(number+" is not a prime number."));
    }
}