package Queue_Queue;

import java.util.Queue;
import java.util.LinkedList;

public class JCF_Queue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();


        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
