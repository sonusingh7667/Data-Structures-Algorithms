package Hashing_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class IteneararyTickets {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String , String> reverseMap = new HashMap<>();

        for (String key : tickets.keySet()){
            reverseMap.put(tickets.get(key), key );
        }

        for (String key : tickets.keySet()){
            if (!reverseMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai", " Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", " Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()){
            System.out.print(" -> "+ tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
