import java.util.Scanner;

public class Schools
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String names[] = new String[20];
        int tel[] = new int[20];
        System.out.println("Enter 20 names and telephone numbers: ");
        for (int i=0; i<20; i++)
        {
            System.out.println((i+1)+">");
            names[i] = in.nextLine();
            tel[i] = in.nextInt();
            in.nextLine();
        }
        
        for (int i=0; i<19; i++) 
        {
            int min=i;
            for (int j=i+1; j<20; j++) {
                if (names[j].compareToIgnoreCase(names[min]) < 0) {
                    min = j;
                }
            }
            String temp = names[min];
            names[min] = names[i];
            names[i] = temp;
            
            int t = tel[min];
            tel[min] = tel[i];
            tel[i] = t;
        }
        
        System.out.println("Name\tTelephone Number");
        for (int i=0; i<20; i++) {
            System.out.println(names[i] + "\t" + tel[i]);
        }
    }
}