package Hashing_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_HashSet {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Mumbai");
        cities.add("Chennai");

//        Iterator it = cities.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        SAME SAME SAME SAME SAME SAME

        for (String city : cities){
            System.out.println(city);
        }
    }
}
