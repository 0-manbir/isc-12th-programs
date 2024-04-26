public class Ascii
{
    public static void main(int n)
    {
        if(n>=48 && n<=57)
            System.out.println("digit");
        else if(n>=65 && n<=90)
            System.out.println("upper case letter");
        else if(n>=97 && n<=122)
            System.out.println("lower case letter");
        else
            System.out.println("special character");
    }
}
//sample input - 72
//output       - upper case letter