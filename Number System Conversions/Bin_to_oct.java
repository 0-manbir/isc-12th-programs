import java.util.*;

class Bin_to_oct
{
    static void main(){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String[] list = input.split("\\.");
        int num=Integer.parseInt(list[0]), rem=0;
        String dec = (list.length==2)?(list[1]):("");
        
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> numberDec = new ArrayList<Integer>();
        
        int[] binEq = {000,001,010,011,100,101,110,111};
    }
}