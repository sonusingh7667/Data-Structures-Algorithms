package DSA__Arrays;

public class BinarySearch {

    public static int binarySearch(int number[], int key){
        int start= 0;
        int end = number.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,99,11,12,13,14,15,16};
        int key = 153;

        System.out.println("Index for key is: "+binarySearch(number, key));
    }
}
