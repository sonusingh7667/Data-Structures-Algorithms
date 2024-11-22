package Hashing_Hashing;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LL_HashSet {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();  // it is not in the order

        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Patna");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();  // it is in order wise
        lhs.add("Delhi");
        lhs.add("Bengaluru");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Patna");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();  //it is in ascending Order
        ts.add("Delhi");
        ts.add("Bengaluru");
        ts.add("Mumbai");
        ts.add("Chennai");
        ts.add("Patna");

        System.out.println(ts);


    }
}
