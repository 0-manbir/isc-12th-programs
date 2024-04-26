public class DoublyLinkedList
{
    Node head;
    private int length;
    
    DoublyLinkedList() {
        length = 0;
        head = null;
    }
    
    static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
        
        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    
    // get position
    public int getPosition(int data) {
        Node curr = this.head;
        
        if(curr == null) {
            return -1;
        }
        
        int index = 0;
        
        while(curr != null) {
            if(curr.data == data) {
                return index;
            }
            
            index++;
            curr = curr.next;
        }
        
        return -1;
    }
    
    // get length
    public int length() {
        return length;
    }
    
    // to string
    public String toString() {
        if(this.length == 0) {
            return "[Empty]";
        }
        
        Node curr = this.head;
        String out = "[";
        
        while(curr != null) {
            out += curr.data + " ";
            curr = curr.next;
        }
        
        return out.trim() + "]";
    }
    
    public String toString1() {
        String result = "[]";
        if(length == 0)
            return result;
            
        result = "[" + head.data;
        Node temp = head.next;
        while(temp != null) {
            result += "," + temp.data;
            temp = temp.next;
        }
        
        return result + "]";
    }
    
    // clear list
    public void clear() {
        this.head = null;
        length = 0;
    }
    
    // insert at beginning
    public void insertAtBeginning(int data) {
        Node head = this.head;
        length++;
        
        if(head == null) {
            this.head = new Node(data);
            return;
        }
        
        Node node = new Node(data, null, head);
        this.head.prev = node;
        this.head = node;
    }
    
    // insert at end
    public void insertAtEnd(int data) {
        Node curr = this.head;
        
        if(this.length == 0) {
            length++;
            this.head = new Node(data);
            return;
        }
        
        while(curr.next != null) {
            curr = curr.next;
        }
        
        curr.next = new Node(data, curr, null);
        length++;
    }
    
    // insert at a position
    public void insertAtPosition(int data, int position) {
        Node curr = this.head;
        
        if(position > this.length) 
            position = length;
        
        if(position == this.length) {
            this.insertAtEnd(data);
            return;
        }
        
        if(position == 0) {
            this.insertAtBeginning(data);
            return;
        }
        
        if(curr == null) {
            this.head = new Node(data);
            return;
        }
        
        int index = 0;
        
        while(index < position-1) {
            curr = curr.next;
            index++;
        }
        
        Node node = new Node(data, curr, curr.next);
        curr.next.prev = node;
        curr.next = node;
        length++;
    }

    // remove head
    public void removeHead() {
        if(length == 0) {
            return;
        }
        
        if(length == 1) {
            this.clear();
            return;
        }
        
        Node head = this.head;
        Node newHead = head.next;
        this.head = newHead;
        newHead.prev = null;
        head.next = null;
        length--;
    }
    
    // remove tail
    public void removeTail() {
        Node curr = this.head;
        
        if(length == 0) {
            return;
        }
        
        if(length == 1) {
            this.clear();
            return;
        }
        
        while(curr.next != null) {
            curr = curr.next;
        }
        
        Node last = curr.prev;
        last.next = null;
        curr.prev = null;
        length--;
    }
    
    // remove at position
    public void removeAtPosition(int position) {
        Node curr = this.head;
        
        if(length == 0 || position >= length) {
            return;
        }
        
        if(position == 0) {
            this.removeHead();
            return;
        }
        
        if(position == length-1) {
            this.removeTail();
            return;
        }
                
        int index = 0;
        length--;
        
        while(index < position) {
            curr = curr.next;
            index++;
        }
        
        Node first = curr.prev;
        Node second = curr.next;
        
        first.next = second;
        second.prev = first;
        
        curr.next = null;
        curr.prev = null;
    }
    
    // remove matched
    public void removeMatched(Node node) {
        Node curr = this.head;
        
        if(length == 0)
            return;
        
        if(node.equals(curr)) {
            this.removeHead();
            return;
        }
        
        int index = 0;
        
        while(curr != null) {
            if(curr.equals(node)) {
                break;
            }
            
            curr = curr.next;
            index++;
        }
        
        if(index == length-1) {
            this.removeTail();
            return;
        }
        
        if(index != length) {
            this.removeAtPosition(index);
        }
    }
    
    public static void main(String[] args)
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.insertAtEnd(45);
        dll.insertAtBeginning(12);
        dll.insertAtBeginning(78);
        dll.insertAtEnd(96);
        dll.insertAtPosition(10, 2);
        System.out.println(dll.length() + " > " + dll.toString());
        
        //dll.removeAtPosition(2);
        //dll.removeMatched(dll.head.next.next);
        //dll.removeHead();
        //dll.removeTail();
        
        //System.out.println("position of 78: " + dll.getPosition(78));
        //System.out.println("position of any other element: " + dll.getPosition(26));
        
        //dll.clear();
        System.out.println(dll.length() + " > " + dll.toString1());
    }
}