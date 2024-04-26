public class Dec_to_bin
{
    public static void main(int num)
    {
        String output="";
        
        while(num>0){
            output += num%2;
            num/=2;
        }
        
        for(int i=output.length()-1; i>=0; i--)
            System.out.print(output.charAt(i));
    }
}
