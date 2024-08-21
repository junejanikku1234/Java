package Lab_Workbook;
// Write a program to create a doubly linked list of n nodes and perform:
//•	Insertion
//At the beginning
//At the end
//At a specific location
//•	Deletion
//At the beginning
//At the end
//At a specific location

class DoublyLinkedList {

    // Node class representing each element in the list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
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
            head.prev = newNode;
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
            newNode.prev = temp;
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
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            }

            temp.next = newNode;
        }
    }

    // Deletion at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            if (temp.prev != null) {
                temp.prev.next = null;
            } else {
                head = null;
            }
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

        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
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
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtPosition(25, 3);
        dll.displayList();  // Expected: 20 10 25 30 40

        dll.deleteAtBeginning();
        dll.displayList();  // Expected: 10 25 30 40

        dll.deleteAtEnd();
        dll.displayList();  // Expected: 10 25 30

        dll.deleteAtPosition(2);
        dll.displayList();  // Expected: 10 30
    }
}

