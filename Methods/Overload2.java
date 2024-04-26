public class Overload2
{
    void display(String str, char ch)
    {
        if(str.charAt(0)==ch && str.charAt(str.length()-1)==ch)
            System.out.println("Special Word");
        else
            System.out.println("Not a special word.");
    }
    
    void display(String str1, String str2)
    {
        if(str1.equals(str2))
            System.out.println("The strings are equal.");
        else
            System.out.println("The strings are not equal.");
    }
    
    void display(String str, int n)
    {
        System.out.print(str.charAt(n+1));
    }
}
