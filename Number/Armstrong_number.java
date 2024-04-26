import java.util.*;
class Armstrong_number
{
    public static void main(String[]a){
        Scanner s = new Scanner(System.in);
        int rem=0, num=0, number=0, sum=0;
        num = number = s.nextInt();
        
        while(num>0){
            rem = num%10;
            sum += Math.pow(rem, 3);
            num/=10;
        }
        
        System.out.println((sum==number)?(number+" is an armstrong number"):(number+" is not an armstrong number"));
    }
}