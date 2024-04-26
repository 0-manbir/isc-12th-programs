import java.util.Scanner;

public class Replace_vowel_20
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String inp = sc.nextLine().toUpperCase();
        
        for(int i=0; i<inp.length(); i++)
        {
            switch(inp.charAt(i))
            {
                case 'A':
                    System.out.print('E'); break;
                case 'E':
                    System.out.print('I'); break;
                case 'I':
                    System.out.print('O'); break;
                case 'O':
                    System.out.print('U'); break;
                case 'U':
                    System.out.print('A'); break;
                default:
                    System.out.print(inp.charAt(i));
            }
        }
    }
}
