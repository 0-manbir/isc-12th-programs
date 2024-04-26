import java.util.Scanner;

class Patterns_menu{
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Right Triangle\n2. Left Triangle");
        int x = sc.nextInt();
        
        switch(x){
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            default:
                System.out.println("Enter a number from 1 to 10!");
        }
    }
    
    static void one(){
        System.out.print("Number: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        
        System.out.print("Character: ");
        String ch = sc.next();
        
        for(int i=1; i<=inp; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    static void two(){
        System.out.print("Number: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        
        System.out.print("Character: ");
        String ch = sc.next();
        
        for(int i=1; i<=inp; i++){
            int spaces = inp - i;
            for(int j=0; j<spaces; j++){
                System.out.print(" " + " ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        
    }
}