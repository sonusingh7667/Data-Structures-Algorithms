package Recursion;


//TO FIND THE FIRST OCCURENCE OF AN ELEMENT IN AN ARRAY............................................

public class Problem_02 {

    public static int firstOccurence(int arr[] , int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }




    public static int lastOccurence(int arr[] , int key, int i){

        if(i == arr.length){
            return -1;
        }
        int isFound =  lastOccurence(arr, key, i+1);
        if(isFound== -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){

        int arr[] = {2,7,4,9,6,15,8,3,2};
//        int key = 15;
        System.out.println(lastOccurence(arr , 6, 0));
     }
}
