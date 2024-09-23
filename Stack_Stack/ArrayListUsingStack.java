package Stack_Stack;

import java.util.ArrayList;

public class ArrayListUsingStack {

    public static class Stack {
         ArrayList<Integer> list = new ArrayList<>();

        public  boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public void push(int data) {
            list.add(data);
        }

        // Pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;  // You can also throw an exception here
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;  // You can also throw an exception here
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
