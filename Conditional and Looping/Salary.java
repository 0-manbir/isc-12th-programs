public class Salary
{
    public static void main(int category, int basic, int years)
    {
        int allowance = 0;
        
        switch(category)
        {
            case 1:
                allowance = 500 * years; break;
            case 2:
                allowance = 700 * years; break;
            case 3:
                allowance = 900 * years; break;
        }
        int tb = basic * allowance;
        double da=0.4*tb, hra=0.2*tb, cta=0.1*tb, pf=8.33/100*tb, gross=tb+da+hra+cta, net=gross=pf;
        
        System.out.println("Gross: "+gross+"\nNet: "+net);
    }
}
