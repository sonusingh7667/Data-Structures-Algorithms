package LinkedList_LinkList;

public class AddNodeIn_middle {

    // Inner Node class to represent each node in the linked list
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List properties
    public static Node head;
    public static Node tail;
    public static int size;

    // Constructor to initialize the list
    public AddNodeIn_middle() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add a node at the beginning of the linked list
    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Method to add a node at the end of the linked list
    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to print the linked list
    public void print() {
        if (head == null) {
            System.out.println("List is empty.");
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
        AddNodeIn_middle list = new AddNodeIn_middle();
        list.AddFirst(2);
        list.AddFirst(1);
        list.AddLast(3);

        list.print();  // Output: 1 2 3
    }
}
