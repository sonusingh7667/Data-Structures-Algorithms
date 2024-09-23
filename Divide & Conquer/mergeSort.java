package Divide__Conquer;

//.....................O(nlogn)...............GOOD TIME COMPLYXITY............


public class mergeSort {

    public static void mergeSortt(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSortt(arr , si , mid); //left part
        mergeSortt(arr, mid+1, ei); //right part

        // This is where you should merge the two halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei ){
        int temp[] = new int[ei - si + 1];
        int i = si;   //iterater for left part
        int j = mid + 1;  // iterater for right part
        int k = 0;    // iterater for temp part

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSortt(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
