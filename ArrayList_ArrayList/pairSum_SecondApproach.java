package ArrayList_ArrayList;

import java.util.ArrayList;

public class pairSum_SecondApproach {

    public static boolean printSum1(ArrayList<Integer> list, int target){
        int lp=0;
        int rp= list.size()-1;

        while (lp != rp){
            //case 1111
            if(list.get(lp) + list.get(rp) == target ){
                return true;
            }
            //case 2222
            if (list.get(lp) + list.get(rp) < target){
                lp++;
            }else {
                //case 333
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
        int target = 50;

        System.out.println(printSum1(list, target));
    }
}
