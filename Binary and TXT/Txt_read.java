import java.util.Scanner;
import java.io.*;

public class Txt_read
{
    public static void main() throws IOException
    {
        File file = new File("file.txt");
        Scanner s = new Scanner(file);
        
        while(s.hasNextLine())
            System.out.println(s.nextLine());
    }
}
