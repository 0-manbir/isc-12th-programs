import java.util.Scanner;

public class Sphenic
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        
        int[] f = new int[3];    // stores the factors of a number (a sphenic number can have only 3 factors)
        int pos = 0;             // stores the position in the array 'f'
        
        for(int i=2; i<=n; i++)
        {
            while(n%i==0)
            {
                if(pos >= 3)     // store no more than 3 factors
                    break;
                
                f[pos++] = i;   // store the factor and move to the next position (in the array)
                n /= i;
            }
        }
        
        // check if there are 3 factors  and  all the three elements are unique
        if(pos == 3 &&   f[0] != f[1]  &&  f[1] != f[2]  && f[2] != f[0])
            System.out.println("yes");
        else
            System.out.println("no");
    }
}