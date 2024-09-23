package Queue_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Two2_queue_Stack {

    public static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if (!q1.isEmpty()){
                q1.add(data);
            }
            else {
                q2.add(data);
            }
        }

        public static int pop(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }

            int top = -1;

            //case-1
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top = q1.remove();
                    if (q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else {   //case-2..
                while (!q2.isEmpty()){
                    top = q2.remove();
                    if (q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }

            int top = -1;

            //case-1
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }
            else {   //case-2..
                while (!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;

        }


    }




    public static void main(String[] args){

        Stack ss = new Stack();

        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);

        while (!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
        }
    }
}
