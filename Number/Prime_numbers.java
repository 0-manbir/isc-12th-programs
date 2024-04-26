import java.util.*;
class Prime_numbers
{
    public static void main(String[]a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean isPrime = true;
        List<Integer> primeNumbers = new ArrayList<Integer>();
        
        for(int i=(num1+1); i<num2; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                primeNumbers.add(i);
            }
            isPrime = true;
        }
        
        for(int x:primeNumbers)
        {
            System.out.print((primeNumbers.get(primeNumbers.size()-1) == x)?(x):(x+", "));
        }
    }
}