public class New_digit
{
    public static void main(int n)
    {
        int digits=0, last=n%10;
        
        while(n>0){
            digits++;
            n/=10;
        }
        System.out.println(digits+""+last);
    }
}
