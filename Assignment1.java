public class Assignment1 {
    public static void main(String[] args) {
        IntSinglyLinkedList list = new IntSinglyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.println("List after adding elements to the front: " + list);

        list.removeValue(20);
        System.out.println("List after removing value 20: " + list);

        int removedValue = list.removeFirst();
        System.out.println("Removed value from front: " + removedValue);
        System.out.println("List after removing front element: " + list);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
