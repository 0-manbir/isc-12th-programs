class Pattern_25b
{
    static void main()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=6-i; j>0; j--)
                System.out.print((char) ('A'+(i-1)) + " ");
            
            for(int j=0; j<i; j++)
                System.out.print(i+" ");
                
            System.out.println();
        }
    }
}
