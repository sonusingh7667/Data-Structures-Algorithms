package ArrayList_ArrayList;

import java.util.ArrayList;

public class ROUGH_ArrayList {


    public static boolean pairsum(ArrayList<Integer> list , int target){
        int lp=0;
        int rp = list.size()-1;
        while (lp != rp){
//            case1
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
//            case2
            if (list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int target = 10;
        System.out.println(pairsum(list, target));


    }
}
