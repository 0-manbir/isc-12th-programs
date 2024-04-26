import java.io.*;
import java.util.Scanner;

public class Binary_write
{
    public static void main () throws IOException
    {
        FileOutputStream fout = new FileOutputStream("file.dat", true);
        DataOutputStream ffout = new DataOutputStream(fout);
        
        System.out.println("Input a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        ffout.writeUTF(s);
        ffout.writeInt(122);
        
        fout.close();
        ffout.close();
    }
}
