public class Fibonacci_range
{
    public static void main(){
        int n1=0, n2=1, sum=0, a=100, b=10000;
        
        while(sum+n2<b){
            sum = n1+n2;
            if(sum>a)
                System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}
