import java.util.Scanner;

public class IncomeTax
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Name: ");
        String name = s.nextLine();
        System.out.println("Income: ");
        int income = s.nextInt();
        
        System.out.println("Tax: "+Tax(name, income));
    }
    
    static double Tax(String name, int income)
    {
        if(income <= 250000)
            return 0;
        else if(income <= 500000)
            return(0.1*(income-250000));
        else if(income <= 1000000)
            return(5000+(0.2*(income-500000)));
        else
            return(25000+0.3*(income-1000000));
    }
}
