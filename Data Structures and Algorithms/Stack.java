public class Stack
{
    int stack[], length, sp;
    
    Stack(int n)
    {
        stack = new int[n];
        sp = -1;
        length = n;
    }
    
    void push(int n)
    {
        if(sp >= length-1)
        {
            System.out.println("Stack Overflow!");
            return;
        }
        
        stack[++sp] = n;
    }
    
    void pop()
    {
        if(sp <= -1)
        {
            System.out.println("Stack Underflow!");
            return;
        }
        
        System.out.println("Popped element: " + stack[sp--]);
    }
    
    void peep()
    {
        if(sp >= length)
        {
            System.out.println("Index too high!");
            return;
        }
        
        System.out.println("Peep element: " + stack[sp]);
    }
    
    void change(int index, int data)
    {
        if(index >= length)
        {
            System.out.println("Index too high!");
            return;
        }
        
        stack[index] = data;
    }
    
    int size()
    {
        return sp+1;
    }
    
    boolean isEmpty()
    {
        return sp==-1;
    }
    
    boolean isFull()
    {
        return sp==length-1;
    }
    
    void print()
    {
        System.out.println("Stack:");
        
        for(int i=sp; i>=0; i--)
            System.out.println(" > " + stack[i]);
            
        System.out.println("Size: " + this.size());
    }
    
    
    public static void main(String[] args)
    {
        Stack st = new Stack(5);
        
        st.push(45);
        st.push(2);
        st.push(37);
        st.push(7);
        st.push(87);
        st.push(97);
        
        st.change(4, 56);
        
        st.print();
    }
}