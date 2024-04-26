import java.util.*;

class Maths{
    static void PrimeNumber(){
        //PrimeNumber----------------------------------------------------------------------------------------
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        boolean prime = true;
        
        for(int i=2; i<x; i++){
            if(x%i==0){
                prime = false;
                break;
            }
        }
        
        if(prime){
            System.out.println(x+" is prime.");
        }else{
            System.out.println(x+" is not prime");
        }
    }
    
    static void SumOfDigits(){
        //SumOfDigits----------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        int sum=0;
        
        while(x>0){
            sum += x%10;
            x/=10;
        }
        
        System.out.println("Sum of digits is "+sum);
    }
    
    static void LargestNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        System.out.println("The largest number is "+((x>y)?(x>z?x:z):(y>z?y:z)));
    }
    
    static void LCM(){
        //LCM------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int lcm = (x>y)?x:y;
        while(true){
            if(lcm%x==0 & lcm%y==0){
                System.out.printf("LCM of %d and %d is %d.",x,y,lcm);
                break;
            }
            lcm++;
        }
    }
    
    static void CI(){
        //Compund Interest-----------------------------------------------------------------------------------
        Scanner sc = new Scanner (System.in);
        System.out.println("Principal: ");
        double p = sc.nextInt();
        System.out.println("Rate: ");
        double r = sc.nextInt();
        System.out.println("Time: ");
        double t = sc.nextInt();
        
        double ci = p*Math.pow((1+(r/100)),t) - p;
        double a = p+ci;
        System.out.printf("\nThe Compound Interest is %.2f",ci);
        System.out.printf("\nThe Amount Due after %.0f years is %.2f.",t,a);
    }
    
    static void ReverseList(){
        //Reverse List---------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        
        while(true){
            int in = sc.nextInt();
            
            if(in==0){
                break;
            }else{
                list.add(in);
            }
        }
        
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + "  ");
        }
    }
}