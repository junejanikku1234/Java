package September_04_09_2024;

public class linkList2func {

    private Node head = null;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addByValue(int value, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found in list");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void addByIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int currentIndex = 0;
        while (temp != null && currentIndex < index - 1) {
            temp = temp.next;
            currentIndex++;
        }
        if (temp == null) {
            System.out.println("Index given is out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkList2func list = new linkList2func();
        list.printList();
        list.addByIndex(3,50);
        list.addByValue(1, 25);
        list.addByIndex(0,10);
        list.addByIndex(1,20);
        list.addByIndex(2,30);
        list.addByValue(1,76);
        list.printList();

    }
}
