package August_21_08_2024;

public class circular_linked_list {

    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add node to the list
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

    // Print list elements
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    // Delete node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        // Special case: only one node in the list
        if (head == tail && head.data == value) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        Node previous = tail;

        // Check if head needs to be deleted
        if (head.data == value) {
            previous.next = head.next;
            head = head.next;
            return;
        }

        // Traverse the list to find the node to delete
        do {
            previous = current;
            current = current.next;
        } while (current != head && current.data != value);

        if (current == head) {
            System.out.println("Element not found in the list");
            return;
        }

        // Update pointers to remove the node
        previous.next = current.next;

        // Update tail if necessary
        if (current == tail) {
            tail = previous;
        }
    }

    // Delete node by index
    public void deleteByIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Special case: delete head node
        if (index == 0) {
            deleteByValue(head.data);
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 0;

        // Traverse the list to find the node at the specified index
        do {
            previous = current;
            current = current.next;
            count++;
        } while (count != index && current != head);

        if (current == head) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Update pointers to remove the node
        previous.next = current.next;

        // Update tail if necessary
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
