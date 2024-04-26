public class Triangle
{
    public static void main(int a, int b, int c)
    {
        System.out.println(triangle(a,b,c));
    }
    
    static String triangle(int a, int b, int c)
    {
        if(!(a+b>c && b+c>a && a+c>b))
            return("This triangle is not possible!");
        
        if(a==b && b==c && c==a)
            return("Equilateral triangle");
        else if(a==b || b==c || c==a)
            return("Isosceles triangle");
        else
            return("Scalene triangle");
    }
}
