public class Pattern_1
{
    public static void main(){
        int a=0, b=9;
        
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++)
                System.out.print(a+++" ");
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++)
                System.out.print(b--+" ");
            System.out.println();
        }
    }
}
