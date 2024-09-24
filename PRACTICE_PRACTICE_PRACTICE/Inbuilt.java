package PRACTICE_PRACTICE_PRACTICE;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt {
    public static void main(String[] args){
        Integer arr[] = {7,4,9,2,6,8,22,33,11,55};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

//        for reverse
        Arrays.sort(arr , Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

    }
}
