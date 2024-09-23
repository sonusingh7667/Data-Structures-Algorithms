package LinkedList_PART_2;
import  java.util.LinkedList;


public class Inbuilt_linkedList {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

       ll.addFirst(3);
       ll.addLast(5);
       ll.addFirst(2);
       ll.addLast(6);
       ll.addFirst(1);
       ll.addLast(7);
       ll.addFirst(0);
       ll.removeFirst();

        System.out.println(ll);



    }
}
