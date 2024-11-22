package Hashing_Hashing;

import java.util.HashMap;

public class Basic_HashMap {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 150);
        hm.put("Nepal", 10);

        System.out.println(hm);

        //Get- O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //containsKey  O(1)
        System.out.println(hm.containsKey("India"));  //True

        System.out.println(hm.containsKey("Indonesia")); //false

        //remove  O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
