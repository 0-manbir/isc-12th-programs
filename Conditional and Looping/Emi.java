public class Emi
{
    public static void main(double loan)
    {
        loan *= 0.9;
        
        calc(loan, 1450, 10);
        calc(loan, 1325, 12);
        calc(loan, 1250, 15);
        calc(loan, 1175, 18);
        calc(loan, 1100, 20);
    }
    
    public static void calc(double amount, int emi, int time)
    {
        double loanAmount = amount / 100000 * emi * time * 12;
        System.out.println("The amount payable for "+time+" years at an emi of Rs. "+emi+" is Rs. "+loanAmount);
    }
}