package Queue_Queue;
import java.util.*;

public class Deque_inStack {

    public static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }



    public static void main(String[] args){

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+s.peek());

        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
