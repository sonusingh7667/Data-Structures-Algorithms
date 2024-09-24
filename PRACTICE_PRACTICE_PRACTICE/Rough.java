package PRACTICE_PRACTICE_PRACTICE;


public class Rough {


    public static void printPair(int arr[]){
        for (int i=0; i< arr.length; i++){
//            int curr = arr[i];
            for (int j=i+1; j< arr.length; j++){
                System.out.print("("+i+" ,"+j+")");
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
    int arr[] = {4,8,5,9,1,7,4,77,24,16,55,986};

    printPair(arr);




    }
}
