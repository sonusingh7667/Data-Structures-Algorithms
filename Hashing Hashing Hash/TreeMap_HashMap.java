package Hashing_Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMap_HashMap {
    public static void main(String [] args){
        TreeMap<String, Integer> thm = new TreeMap<>();  //Alphabetical Order

        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 150);
        thm.put("Nepal", 10);
        thm.put("Indonesia", 30);

        System.out.println(thm);






        HashMap<String, Integer> hm = new HashMap<>();
        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 150);
        hm.put("Nepal", 10);

        System.out.println(hm);
    }
}
