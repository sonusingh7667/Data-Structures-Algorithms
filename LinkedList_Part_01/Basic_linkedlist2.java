package LinkedList_LinkList;

public class Basic_linkedlist2 {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void AddFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if (head == null){
            System.out.println("head is empty...");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void AddNodeInmiddle(int idx , int data){
        if (idx == 0){
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0){
            System.out.println("ll is empty...");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0){
            System.out.println("ll is empty...");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i=0; i< size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public static void main(String[] args){
        Basic_linkedlist2 ll = new Basic_linkedlist2();
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(1);
        ll.AddFirst(3);
        ll.AddFirst(9);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddNodeInmiddle(1, 10);
        ll.AddNodeInmiddle(9,7);
        ll.AddNodeInmiddle(0,8);
        ll.print();
//        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();


    }
}
