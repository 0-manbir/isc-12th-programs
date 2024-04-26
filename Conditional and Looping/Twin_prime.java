public class Twin_prime
{
    public static void main(int n1, int n2){
        boolean p1=true, p2=true;
        
        for(int i=2; i<n1; i++){
            if(n1%i==0){
                p1=false;break;
            }
        }
        
        for(int i=2; i<n2; i++){
            if(n2%i==0){
                p2=false;break;
            }
        }
        
        if((!p1)||(!p2))
            System.out.println("Not prime");
        else{
            if(n2-n1==2)
                System.out.println("Twin prime numbers");
            else
                System.out.println("Not twin prime");
        }
    }
}
