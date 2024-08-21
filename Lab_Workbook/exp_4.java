package Lab_Workbook;
// Write a program to create a singly linked list of n nodes and perform:
//•	Insertion
//At the beginning
//At the end
//At a specific location
//•	Deletion
//At the beginning
//At the end
//At a specific location

class SinglyLinkedList {

    // Node class representing each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Insertion at a specific location
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Deletion at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Deletion at a specific location
    public void deleteAtPosition(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Invalid position or list is empty");
            return;
        }

        if (position == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Display the list
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // Insertion examples
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(20);
        sll.insertAtEnd(30);
        sll.insertAtEnd(40);
        sll.insertAtPosition(25, 3);
        sll.displayList();  // Expected output: 20 10 25 30 40

        // Deletion examples
        sll.deleteAtBeginning();
        sll.displayList();  // Expected output: 10 25 30 40

        sll.deleteAtEnd();
        sll.displayList();  // Expected output: 10 25 30

        sll.deleteAtPosition(2);
        sll.displayList();  // Expected output: 10 30
    }
}
