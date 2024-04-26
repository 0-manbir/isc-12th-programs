import java.util.Scanner;

public class Calculator12
{
    public static void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an equation: ");
        String inp = s.nextLine();
        boolean add = false;
        
        for(int i=0; i<4; i++)
        {
            char[] li = {'/', '*', '+', '-'};
            
            while(inp.indexOf(li[i]) != -1)
            {
                int index = inp.indexOf(li[i]), i1=index-1, i2=index+1, rIndex1=0,rIndex2=0, n1,n2;
                String num1="", num2="";
                
                while(i1!=-1){
                    char ch = inp.charAt(i1);
                    if(ch=='/' || ch=='*' || ch=='+' || ch=='-'){
                        rIndex1 = i1;
                        break;
                    }
                    else
                        num1 += ch;
                    i1--;
                }
                while(i2<inp.length()){
                    char ch = inp.charAt(i2);
                    if(ch=='/' || ch=='*' || ch=='+' || ch=='-'){
                        rIndex2 = i2;
                        break;
                    }
                    else
                        num2 += ch;
                    i2++;
                }
                
                String rev1="", rev2="";
                for (int j=0; j<num1.length(); j++)
                    rev1 += num1.charAt(j);
                for (int j=0; j<num2.length(); j++)
                    rev2 += num2.charAt(j);
                
                //1st number is negative
                if(inp.charAt(0) == '-'){
                    inp = inp.substring(1);
                    add = true;
                }
                
                n1 = Integer.parseInt(rev1);
                n2 = Integer.parseInt(rev2);
                int n = 0;
                switch(li[i]){
                    case '/':
                        n = n1/n2;
                        break;
                    case '*':
                        n = n2*n1;
                        break;
                    case '+':
                        n = n2+n1;
                        break;
                    case '-':
                        if(add)
                            n = n1+n2;
                        n = n1-n2;
                        break;
                }
                
                if(rIndex1==0 && rIndex2==0){
                    inp = Integer.toString(n);
                    break;
                }
                
                
                if(!Character.isDigit(inp.charAt(rIndex1)))rIndex1++;
                //if(!Character.isDigit(inp.charAt(rIndex2)))rIndex2++;
                
                if(add){
                    add = false;
                    inp = "-" + n + inp.substring(rIndex2);
                }else
                    inp = inp.substring(0,rIndex1) + n + inp.substring(rIndex2);
                
                System.out.println("indexLeft = "+rIndex1+"   indexRight = "+rIndex2 + "   inp = "+inp);
            }
        }
        System.out.println("The result is "+inp);
    }
}
/*  4+16/2*3-9      19

1 /
2 *
3 +
4 -

*/