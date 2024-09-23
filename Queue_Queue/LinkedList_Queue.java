package Queue_Queue;

public class LinkedList_Queue {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class Queue{
        public static Node head;
        public static Node tail;

        public static boolean isEmpty(){
            return head == null && tail ==null;
        }

        //add
        public static void add(int data){
            Node newNode = new Node(data);

            if (head == null){
                head = tail = newNode;
                return;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        //remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("queue is empty11111");
                return -1;
            }
            int front = head.data;
            if (tail == head){
                head = tail = null;

            }
            else {
                head = head.next;
            }
            return front;
        }

        //peek...
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue iss emptooooooooooooky...");
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args){

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
