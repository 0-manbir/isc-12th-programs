public class Bonus
{
    public static void main(char grade, int basic)
    {
        double bonus=0;
        
        switch(grade)
        {
            case 'A':
                bonus = 12/100*basic;
                bonus = (bonus>50000)?50000:bonus;
                break;
            case 'B':
                bonus = 10/100*basic;
                bonus = (bonus>40000)?40000:bonus;
                break;
            case 'C':
                bonus = 8.33/100*basic;
                bonus = (bonus>30000)?30000:bonus;
                break;
        }
        System.out.println("bonus: "+bonus);
    }
}
