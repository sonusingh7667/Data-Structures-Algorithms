package ArrayList_ArrayList;

import java.util.ArrayList;

public class Basic_arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(81);
        list.add(29);
        list.add(31);
        list.add(43);
        list.add(59);
        list.add(63);

//        System.out.println(list);
//
//
//        System.out.println( list.get(3));
//        list.remove(2);
//        System.out.println(list);
//        list.set(2,50);
//        System.out.println(list);

//        System.out.println(list.size());
//
//        for (int i=0; i<list.size(); i++){
//            System.out.print(list.get(i));
//        }
//        System.out.println();
//

        //PRINT--REVERSE NUMBER-------O(n)
//        for (int i= list.size()-1; i>=0; i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();



        //MAXIMUM NUMBER INT LIST.....O(n)
        int max = Integer.MIN_VALUE;
        for (int i=0; i< list.size(); i++){
//            if(max < list.get(i)){
//                max = list.get(i);
//
//            }
            max= Math.max(max, list.get(i));
        }

        System.out.println("Maximum number is : "+max);





    }
}
