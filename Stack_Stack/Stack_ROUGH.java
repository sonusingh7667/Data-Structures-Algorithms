package Stack_Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_ROUGH {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
       static Node head = null;

       public boolean isEmpty(){
           return head == null;
       }

       //push
        public void push(int data){
           Node newNode = new Node(data);

           if (isEmpty()){
               head = newNode;
               return;
           }
           newNode.next = head;
           head = newNode;
           return;
        }

        //pop
        public int pop(){
           if (isEmpty()){
               System.out.println("Stack is empty....");
               return -1;
           }
           int top = head.data;
           head = head.next;
           return top;
        }

        //peek
        public int peek(){
           if (isEmpty()){
               System.out.println("Stack is empty...");
               return -1;
           }
           return head.data;
        }
    }



    public static void main(String[] args){

        Stack aa = new Stack();
        aa.push(1);
        aa.push(2);
        aa.push(3);
        aa.push(4);
        aa.push(5);
        aa.push(6);
//        aa.pop();

        while (!aa.isEmpty()){
            System.out.println(aa.peek());
            aa.pop();
        }



    }
}
