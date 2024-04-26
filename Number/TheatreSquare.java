import java.util.Scanner;

public class TheatreSquare
{
    public static void main(int l,int b,int a)
    {
        while(true){
            if(l%a==0)
                break;
            l++;
        }
        while(true){
            if(b%a==0)
                break;
            b++;
        }
        System.out.println((l*b)/(a*a));
    }
}