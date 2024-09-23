package Stack_Stack;

import java.util.Stack;

public class PushAtBotton {

    public static void pushAtBottn(Stack<Integer> s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottn(s, data);
        s.push(top);
    }


    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

    pushAtBottn(s, 4);
    pushAtBottn(s, 5);
    while (!s.isEmpty()){
        System.out.println(s.pop());
    }
    }
}
