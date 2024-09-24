package PRACTICE_PRACTICE_PRACTICE;

public class Sub_Arrays {

//    ..........................BRUTE----FORCE..................................

//    public static void maxSubArray(int arr[]){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i = 0; i< arr.length; i++) {
//            for(int j=i; j< arr.length; j++){
//                currSum = 0;
//                for(int k = i; k <= j; k++){
//                    currSum += arr[k];
//                }
//                System.out.println(currSum);
//                if(maxSum<currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Maximum Sum In subArray :"+maxSum);
//    }


//....................................    Kadanes_Algorithems..........................................................

    public static void kadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            currSum += arr[i];
            if(currSum<0){
                currSum = 0;
            }else{
                maxSum = Math.max(currSum , maxSum);
            }

        }
        System.out.println("Maximum Sum Of subArray is : "+ maxSum);

    }



    public static void main(String[] args){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

//        maxSubArray(arr);
        kadanes(arr);

    }
}
