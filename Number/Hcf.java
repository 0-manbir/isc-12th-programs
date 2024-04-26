import java.util.*;

class Hcf
{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int hcf=0;
        
        List<Integer> factors = new ArrayList<Integer>();
        
        for(int i=1; i<=num1; i++){
            if(num1%i==0)
                factors.add(i);
        }
        
        for(int i=num2; i>=1; i--){
            if(num2%i==0){
                if(factors.contains(i)){
                    hcf = i;
                    break;
                }
            }
        }
        System.out.printf("The HCF of %d and %d is %d.",num1,num2,hcf);
    }
}