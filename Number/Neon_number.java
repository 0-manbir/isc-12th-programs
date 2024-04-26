import java.util.*;

class Neon_number
{
    public static void main(String[]ar){
        Scanner s = new Scanner(System.in);
        int num=0, number=0, rem=0, sum=0;
        num = number = s.nextInt();
        num*=num;
        
        while(num>0){
            rem = num%10;
            sum += rem;
            num/=10;
        }
        
        System.out.println((sum==number)?(number+" is a neon number."):(number+" is not a neon number."));
    }
}