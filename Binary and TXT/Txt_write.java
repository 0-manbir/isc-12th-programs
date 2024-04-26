import java.util.Scanner;
import java.io.*;

public class Txt_write
{
    public static void main() throws IOException
    {
        write();
    }
    
    public static void write() throws IOException
    {
        FileWriter fw = new FileWriter("file.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        String str = s.nextLine();
        
        pw.println(str);
        fw.close();
    }
}
