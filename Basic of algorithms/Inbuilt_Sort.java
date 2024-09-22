
//package Basic_of_algorithms;
//
//
//import java.util.Arrays;
//public class Inbuilt_Sort {
//
//    public static void bubbleSort(int arr[]){
//        for(int turn = 0; turn<arr.length-1; turn++){
//            for(int j=0; j<arr.length-1-turn; j++){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void printArr(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//        int arr[] = {5,4,1,3,2};
//        Arrays.sort(arr, 0, 4);
//        printArr(arr);
//
//    }
//}


//......................................................................................................................


package Basic_of_algorithms;



import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {

    public static void bubbleSort(Integer arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr, 0 , 4, Collections.reverseOrder());
        printArr(arr);

    }
}
