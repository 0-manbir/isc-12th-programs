import java.util.*;

class LeftTriangle
{
    static void main(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String input = s.next();
        
        for(int i=1; i<=num; i++){
            
            for(int j=num-i; j>=0; j--){
                System.out.print("  ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print(input+" ");
            }
            
            System.out.println();
        }
    }
}