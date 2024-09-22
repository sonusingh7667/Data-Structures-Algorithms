package ArrayList_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_indexValue {

    public static void Swap(ArrayList<Integer> list, int indx1 , int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2 , temp);
    }



    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(81);
        list.add(29);
        list.add(31);
        list.add(43);
        list.add(59);
        list.add(63);

        int indx1= 1, indx2=4;
        System.out.println(list);
        Swap(list, indx1, indx2);
        System.out.println(list);




//        .................................................................................................

        //Asccending Order
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        //Deccending Order

//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);


    }

}
