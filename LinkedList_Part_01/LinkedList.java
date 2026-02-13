package LinkedList_LinkList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    System.out.println("Hello");


    public void AddFirst(int data) {
        //step1 = create new nodes
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //steps2 = newNode next =newNode
        newNode.next = head;

        //step head = newNode
        head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {     //O(n)
        if (head == null) {
            System.out.println("head is empty....");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void AddNodeInMiddle(int idx, int data) {
        if (idx == 0) {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Ll is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }


        //prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }


    public int IterectiveSearch(int key){          //O(n)
        Node temp = head;
        int i=0;

        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

//    ................ Recursive Methods................................


    public int helper(Node head, int key){               //O(n)
        if (head == null){
            return -1;
        }

        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return  helper(head, key);
    }

//    ............................Reverse Methods.......................................

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

//    ....................................DELETE-NTH-NUMBER-IN--LL............................................

    public void DeleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next;   //remove First
            return;
        }

//        sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }


//    ...................PALINDROME--LL......................................................

    //slow-fast Approach
    public Node findMid(Node head){    //helper
        Node slow =head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }
        return slow;   //slow is my midNode...
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null){
            return true;
        }
        //find mid
        Node midNode = findMid(head);

        //step2--reverse second half...
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next =curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        Node right = prev;  //right half head
        Node left  = head;

        //step3--check left-half && right half.....
        while (right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


//    ........................................LinkedList Part 2...................................................

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

//    ......................................................................................................................



//    METHODS, add,remove,print,search
    public static void main(String[] args){

        LinkedList ll = new LinkedList();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddNodeInMiddle(2, 3);
        ll.print();


//        System.out.println(ll.size);

//        ll.removeFirst();
//        ll.print();

//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);

//        System.out.println(ll.IterectiveSearch(3));
//        System.out.println(ll.IterectiveSearch(10));

//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.recSearch(10));

//        ll.reverse();
//        ll.print();

//        ll.DeleteNthFromEnd(3);
//        ll.print();

//        System.out.println(ll.checkPalindrome());

//        .....................................Linked___list part-2...................................

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(isCycle());

    }
}

