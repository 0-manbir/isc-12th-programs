import java.util.Scanner;

public class CityStd
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        String[] city = new String[8];
        int[] std = new int[8];
        
        for(int i=0; i<8; i++)
        {
            System.out.println((i+1)+")");
            city[i] = s.nextLine();
            std[i] = s.nextInt();
            s.nextLine();
        }
        
        System.out.println("Enter the city to search: ");
        String n = s.nextLine();
        
        int i;
        boolean found = false;
        
        for(i=0; i<8; i++){
            if(city[i].equals(n)){
                found = true;
                break;
            }
        }
        
        if(found)
            System.out.println("Search successful!\nCity: "+city[i]+"\nSTD: "+std[i]);
        else
            System.out.println("City not present in the list.");
    }
}
