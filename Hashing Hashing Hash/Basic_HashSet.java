package Hashing_Hashing;

import java.util.HashSet;

public class Basic_HashSet {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);
        System.out.println(hs.size());

        hs.remove(4);
        if(hs.contains(4)){
            System.out.println("Yes it is contains");
        }
        else {
            System.out.println("Not contains");
        }

        System.out.println(hs.size());
       hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
    }
}
