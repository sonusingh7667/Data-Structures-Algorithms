package Stack_Stack_Part_2;

import java.util.Stack;
public class Duplicate_PArenthesis {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if (ch == ')'){
                int count = 0;
                while (s.peek() != '('){
                    s.pop();
                    count++;
                }
                if (count < 1){
                    return true;    // duplicate exists
                }
                else {
                    s.pop();   //opening pair pop
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }



    public static void main(String[] args){
        String str1 = "(((a+b)+(s+d)))";     //true
        String str2 = "((a+d)+(f+e))";       // false

        System.out.println(isDuplicate(str2));
    }
}
