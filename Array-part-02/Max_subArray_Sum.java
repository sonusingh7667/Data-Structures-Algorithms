package DSA__Arrays;

public class Max_subArray_Sum {
    public static void maxSubArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum "+maxSum);
    }


    //....................................    Kadanes_Algorithems...............................................

    public static void maxSubArraySum_kadanes(int arr[]){
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


    public static void main(String [] args){
        int num[] = {2,4,6,8,10};

        maxSubArraySum(num);

    }
}
