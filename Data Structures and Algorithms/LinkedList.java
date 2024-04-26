public class LinkedList
{
    Node head;
    private int length;
    
    public LinkedList() {
        head = null;
        length = 0;
    }
    
    static class Node
    {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
        public String toString() {
            if(this == null)
                return "[Empty]";
            
            String out = "[";
            Node curr = this;
        
            while(curr != null) {
                out += curr.data + " ";
                curr = curr.next;
            }
            return out.trim() + "]";
        }
    }
    
    // return the sum of all elements of the list
    public int sum() {
        int sum = 0;
        Node curr = this.head;
        while(curr != null) {
            sum += curr.data;
            curr = curr.next;
        }
        return sum;
    }
    
    // get length
    public int getLength() {
        return length;
    }
    
    // clear list
    public void clear() {
        this.head = null;
        length = 0;
    }
    
    // convert to string
    public String toString() {
        if(this.head == null)
            return "[Empty]";
        
        String out = "[";
        Node curr = this.head;
    
        while(curr != null) {
            out += curr.data + " ";
            curr = curr.next;
        }
        return out.trim() + "]";
    }
    
    // get position of data
    public int getPosition(int data) {
        if(this.head == null)
            return -1;
        
        int index = 0;
        Node curr = this.head;
        
        while(curr != null) {
            if(curr.data == data) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        
        return -1;
    }
    
    // insert at beginning
    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
        length++;
    }
    
    // insert at end
    public void insertAtEnd(int data) {
        Node curr = this.head;
        Node node = new Node(data);
        length++;
        
        // if head node doesn't exist
        if(curr == null) {
            this.head = node;
            return;
        }
        
        while(curr.next != null)
            curr = curr.next;
            
        curr.next = node;
    }
    
    // insert at a position
    public void insertAtPosition(int data, int position) {
        Node curr = this.head;
        length++;
        
        // if list is empty
        if(curr == null) {
            this.head = new Node(data);
            return;
        }
        
        // if index out of bounds
        if(position > length) {
            position = length;
        }
        
        int index = 0;
        
        while(index < position-1) {
            index++;
            curr = curr.next;
        }
        
        Node node = new Node(data);
        node.next = curr.next;
        curr.next = node;
    }
    
    // remove at beginning
    public void removeAtBeginning() {
        if(this.head == null)
            return;
        
        this.head = this.head.next;
        length--;
    }
    
    // remove from end
    public void removeAtEnd() {
        if(this.head == null)
            return;
        
        // to remove head
        if(length == 1) {
            this.removeAtBeginning();
            return;
        }
        
        Node curr = this.head, prev = this.head;
        
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = null;
        length--;
    }
    
    // remove matched
    public void removeMatched(Node node) {
        if(this.head == null)
            return;
            
        if(this.head.equals(node)) {
            this.removeAtBeginning();
            return;
        }
        
        Node curr = this.head.next, prev = this.head;
        
        while(curr != null) {
            if(curr.equals(node)) {
                prev.next = curr.next;
                curr.next = null;
                length--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    
    // remove at position
    public void removeAtPosition(int position) {
        if(this.head == null) 
            return;
        
        if(position >= length)
            return;
            
        if(position == 0) {
            this.removeAtBeginning();
            return;
        }
        
        Node curr = this.head.next, prev = this.head;
        int index = 1;
        
        while(index < position) {
            prev = curr;
            curr = curr.next;
            index++;
        }
        
        prev.next = curr.next;
        curr.next = null;
        length--;
    }
    
    // reverse list
    public Node reverse() {
        if(this.getLength() < 2)
            return null;

        LinkedList reversedLL = new LinkedList();
        Node prev = null, current = this.head, next = null;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    // find nth element from the end
    public int findFromEnd(int n) {
        n = this.length - n;
        int index = 0;
        Node curr = this.head;
        
        while(index++ < n) {
            curr = curr.next;
        }
        
        return curr.data;
    }
    
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.insertAtBeginning(45);
        ll.insertAtEnd(23);
        ll.insertAtBeginning(12);
        ll.insertAtPosition(78, 1);
        System.out.println(ll.toString() + " > " + ll.getLength());
        
        // System.out.println(ll.findFromEnd(1));
        // System.out.println(ll.findFromEnd(2));
        // System.out.println(ll.findFromEnd(3));
        // System.out.println(ll.findFromEnd(4));
        
        // Node node = ll.reverse();
        // System.out.println(node.toString());
        
        // System.out.println("sum: " + ll.sum());
        // System.out.println("position of 45: " + ll.getPosition(45));
        
        // ll.removeMatched(ll.head.next);
        // ll.removeAtBeginning();
        // ll.removeAtEnd();
        // ll.removeAtPosition(2);
        
        // ll.clear();
    }
}