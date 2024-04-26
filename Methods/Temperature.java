import java.util.Scanner;

public class Temperature
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        double[] list = new double[10];
        System.out.println("Enter 10 temperatures: ");
        for(int i=0; i<10; i++)
            list[i] = s.nextDouble();
        
        System.out.println("Temperatures: ");
        for(int i=0; i<10; i++){
            double f = convert(list[i]);
            if(f>98.6)
                System.out.println(list[i]+"-->"+f);
        }
    }
    
    static double convert(double n)
    {
        return(n*1.8 + 32);
    }
}
