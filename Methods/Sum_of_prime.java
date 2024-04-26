import java.util.Scanner;

public class Sum_of_prime
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int[] list = new int[20];
        int sum=0;
        System.out.println("Enter 20 numbers: ");
        for(int i=0; i<20; i++)
            list[i] = s.nextInt();
        
        System.out.println("Prime numers are: ");
        for(int i=0; i<20; i++){
            if(prime(list[i])==0){
                System.out.println(list[i]);
                sum += list[i];
            }
        }
        System.out.println("The sum of prime numbers is "+sum);
    }
    
    static int prime(int n)
    {
        for(int i=2; i<n; i++){
            if(n%i==0)
                return 1;
        }
        return 0;
    }
}
