
import java.util.NoSuchElementException;

public class IntSinglyLinkedList{
    private static class Node{
       
        int value;
        Node next;
       
        Node(int value){
            this.value = value;
            this.next = null;
        } 
    }
//fields  
        Node head;
        int size;
//constructor 
    public IntSinglyLinkedList(){
       
        head = null;
        size = 0;
    }
//methods slot
    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(int value){
       
        Node newNode = new Node(value);
        if(head ==null){
            head = newNode;
        }else{
           
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
           
            current.next = newNode;
        }
       
        size++;
    }
    public int get(int index){
        if (index < 0 || index>=size){
            throw new IndexOutOfBoundsException("Index: "+ index);
        }
        
        Node current = head;
       
        for (int i = 0; i < index;i++){
            current = current.next;
        }
        
        return current.value;
    }
    public int removeFirst(){
        if(head == null){
            throw new NoSuchElementException("List is Empty.");
        }
       
        int value = head.value;
        head = head.next;
        size--;
       
        return value;
    }
    public boolean removeValue(int value){
        if(head == null){
            return false;
        }
        if(head == value){
            return true;
        }
        Node current = head;
        while(current.next != null){
            current.next

        }

    }
}