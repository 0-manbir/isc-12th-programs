import java.util.*;

public class Prime_number
{
    static void main(){
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = s.nextInt(), sum=0, num=n;
        
        while(n>0){
            sum += Math.pow(n%10, 3);
            n/=10;
        }
        
        System.out.println((sum==num)?(num+" is an astronomical number."):(num+" is not an astronomical number."));
    }
}