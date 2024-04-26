public class Salary1
{
    public static void main(int ch, int bs)
    {
        double gross=0;
        
        switch(ch)
        {
            case 1:
                gross = 0.3*bs + bs + 0.2*bs + 0.1*bs; break;
            case 2:
                gross = 0.25*bs + bs + 0.15*bs + 0.05*bs; break;
            case 3:
                gross = bs + 0.2*bs + 0.1*bs; break;
        }
        System.out.println("Gross salary: "+gross);
    }
}
