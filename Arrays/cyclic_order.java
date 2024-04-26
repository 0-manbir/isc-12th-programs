public class cyclic_order
{
    public static void main()
    {
        int[][] list = {{13,22,14,21} ,{16,14,15,10} ,{71,-11,10,12} ,{41,13,11,19}};
        int i1;
        
        for(int i=0; i<4; i++)
        {
            i1 = (i==0)?4:i-1;
            
            for(int j=0; j<4; j++)
                list[i][j] = list[i1][j];
        }
        
        for(int[] i:list)
        {
            for(int j:i)
                System.out.print(j);
            System.out.println();
        }
    }
}
