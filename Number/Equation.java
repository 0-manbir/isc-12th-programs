import java.util.*;

class Equation
{
    static void main()
    {
        Scanner s = new Scanner (System.in);
        System.out.println("\nEnter the equation, \"N\" to cancel.");
        String input = s.next();
        if(!input.contains("N")){
            calc(input);
        }
    }
    
    static void calc(String input){
        List<String> list = new ArrayList<String>();
        
        int sum=0, index=0;
        boolean negative = false;
        
        for(int i=0; i<input.length(); i++){
            list.add(""+input.charAt(i));
        }
        
        String[] num = new String[list.size()];
        
        for(String a : list)
        {
            if(a.contains("+")){
                index++;
            }else if(a.contains("-")){
                index++;
                negative = true;
            }else{
                num[index] = (negative?"-":"")+ (num[index]!=null?num[index]:"") +a;
                negative = false;
            }
        }
        
        for(String a : num){
            if(a!=null){
                sum += Integer.parseInt(a);
            }
        }
        
        System.out.println(sum);
        
        main();
    }
}