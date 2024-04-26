import java.io.*;

class Binary_read
{
    static void main () throws IOException
    {
        FileInputStream fin = new FileInputStream("file.dat");
        DataInputStream ffin = new DataInputStream(fin);
        
        while(true)
        {
            try{
                System.out.print(ffin.readUTF());
                System.out.print(ffin.readInt());
            }catch(EOFException e){
                break;
            }
        }
        
        fin.close();
        ffin.close();
    }
}
