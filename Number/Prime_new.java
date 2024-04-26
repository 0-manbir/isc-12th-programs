import java.util.*;
class Prime_new {
    public static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input: ");
        int n=sc.nextInt(), count=0;
        boolean prime = true;
        
        while(true)
        {
            for(int i=2; i<n; i++)
            {
                if(n%i==0){
                    prime = false;
                    break;
                }
            }
            
            if(prime){
                System.out.print(n+", ");
                count++;
                if(count==20)
                    break;
            }
            n++;
            prime = true;
        }
    }
}