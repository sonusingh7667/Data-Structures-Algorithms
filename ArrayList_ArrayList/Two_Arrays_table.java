package ArrayList_ArrayList;

import java.util.ArrayList;

public class Two_Arrays_table {
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i=0; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loop
//        for (int i=0; i<mainList.size(); i++){
//            ArrayList<Integer> currList = mainList.get(i);
//            for (int j=1; j< currList.size(); j++){
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }

    }
}
