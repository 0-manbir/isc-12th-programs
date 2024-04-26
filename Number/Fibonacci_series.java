import java.util.*;
class Fibonacci_series
{
    public static void main(String[]a){
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int x1=0, x2=1, x=0;
        
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(0,1));
        List<Integer> even = new ArrayList<Integer>();
        
        while(x<n){
            x = x1 + x2;
            list.add(x);
        
            x1 = x2;
            x2 = x;
        }
        
        for(int j:list){
            if(j%2==0){
                System.out.print((list.get(list.size() - 1) == j)?(j):(j+", "));
            }
        }
    }
}