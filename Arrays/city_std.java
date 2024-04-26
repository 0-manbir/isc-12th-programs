import java.util.Scanner;

public class city_std
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        
        String[] list = new String[8];
        int[] tel = new int[8];
        boolean found = false;
        int index=0;
        
        for(int i=0; i<8; i++){
            System.out.println("City "+(i+1)+": ");
            list[i] = s.nextLine();
            tel[i] = s.nextInt();
            s.nextLine();
        }
        
        System.out.println("Enter the city to search: ");
        String n = s.nextLine();
        
        for(int i=0; i<=8; i++){
            if(list[i].equals(n)){
                found = true;
                index = i;
                break;
            }
        }
        
        
        System.out.println((found?("City Name: "+n+" STD Code: "+tel[index]):("city not found")));
    }
}
