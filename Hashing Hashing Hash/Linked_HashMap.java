package Hashing_Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linked_HashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 150);
        lhm.put("Nepal", 10);

        System.out.println(lhm);

//        .......................................................
        HashMap<String, Integer> hm = new HashMap<>();
        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 150);
        hm.put("Nepal", 10);

        System.out.println(hm);
    }
}
