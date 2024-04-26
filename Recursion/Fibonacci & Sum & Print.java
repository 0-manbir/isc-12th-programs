public class Recursion
{
    // calculate factorial of n
    static int fact(int n)
    {
        if(n<=1)
            return 1;
            
        return n * fact(n-1);
    }
    
    // calculate sum of all natural numbers <= n
    static int sum(int n)
    {
        if(n<=0)
            return 0;
        
        return n + sum(n-1);
    }
    
    // print numbers from 1 to n
    static void print(int n, String str)
    {
        if(n<1)
            return;
            
        System.out.println(n + " > " + str + " ");
        print(n-1, str);
    }
    
    // output fibonacci number at nth index
    static int fibonacci(int n)
    {
        if(n==1 || n==2)
            return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}