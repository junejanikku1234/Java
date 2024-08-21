package August_21_08_2024;

public class circular_linked_list {

    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void AddNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        } while(temp != head);
    }

    public void deleteByValue(int value){
        Node temp = head;
        Node prev = null;

        if(head == null){
            System.out.println("List is empty, nothing to delete");
            return;
        }
        else if(head.data == value){
            tail.next = head.next;
            head = head.next;
            return;
        }
        do{
            prev = temp;
            temp = temp.next;
        } while(temp != head && temp.data != value);
        if(temp == head){
            System.out.println("Element not found in the list");
        }
        prev.next = temp.next;
        temp.next = null;
        if(temp == tail){
            tail = prev;
        }

    }

    public void deleteByIndex(int index) {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the index is 0, delete the head node
        if (index == 0) {
            if (head == tail) {
                // If there's only one node
                head = null;
                tail = null;
            } else {
                // Delete the head and reassign it
                tail.next = head.next; // Maintain circularity
                head = head.next;       // Update head
            }
            return;
        }

        // Initialize pointers
        Node current = head;
        Node previous = null;

        // Traverse the list to find the node at the specified index
        int count = 0;
        do {
            previous = current;
            current = current.next;
            count++;
        } while (count != index && current != head);

        // If the index is out of bounds (i.e., we reached back to the head)
        if (current == head) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Update the links to remove the node at the given index
        previous.next = current.next;
        current.next = null;

        // If we deleted the tail, update the tail reference
        if (current == tail) {
            tail = previous;
        }
    }



    public static void main(String[] args) {
        circular_linked_list list = new circular_linked_list();
        list.AddNode(1);
        list.AddNode(2);
        list.AddNode(3);
        list.printList();
        list.deleteByValue(1);
        System.out.println();
        list.printList();
        list.deleteByIndex(1);
        System.out.println();
        list.printList();
    }
}
