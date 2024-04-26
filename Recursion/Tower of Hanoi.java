public class TOH
{
    static void toh(int n, char start, char aux, char end)
    {
        if(n==1)
        {
            System.out.println("Disc moved from " + start + " to " + end);
        }
        else
        {
            toh(n-1, start, end, aux);
            System.out.println("Disc moved from " + start + " to " + end);
            toh(n-1, aux, start, end);
        }
    }
}