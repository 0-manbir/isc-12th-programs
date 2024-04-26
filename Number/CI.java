import java.util.*;
class CI
{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double p = s.nextInt();
        double r = s.nextInt();
        double t = s.nextInt();
        
        double a = p * Math.pow((1+(r/100)),t);
        double ci = a-p;
        
        System.out.printf("The Compound Interest is %.2f and the Amount is %.2f.",ci,a);
    }
}