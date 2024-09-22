package ArrayList_ArrayList;

import java.util.ArrayList;

public class pairSum {

    public static boolean printSum(ArrayList<Integer> height, int target){
        //brute force............O(n^2)..........
        for (int i=0; i< height.size(); i++){
            for (int j=i+1; j< height.size(); j++){
                if(height.get(i) + height.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[]args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);

        int target = 5;
        System.out.println(printSum(height,target));
    }
}
