import java.util.*;

public class Calc
{
    static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers, \"N\" to cancel");
        String input = s.next();
        int num1, num2;
        
        if(!input.contains("N"))
        {
            num1 = Integer.parseInt(input);
            num2 = s.nextInt();
            calc(num1,num2);
        }
    }
    
    static void calc(int a, int b)
    {
        System.out.printf("Add: %d\nSubtract: %d\nMultiply: %d\nDivide: %.2f\n\n",(a+b),(a-b),(a*b),((float)a/b));
        main();
    }
}