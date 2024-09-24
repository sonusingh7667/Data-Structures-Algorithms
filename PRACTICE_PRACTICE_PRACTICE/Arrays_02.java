package PRACTICE_PRACTICE_PRACTICE;

public class Arrays_02 {

//    public static void reverse(int num[]){
//        int first = 0;
//        int last = num.length-1;
//
//        while(first < last){
//            int temp = num[first];
//            num[first] = num[last];
//            num[last] = temp;
//
//            first++;
//            last--;
//        }
//    }



//    public static void printPair(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            int curr = arr[i];
//            for(int j =i+1; j<arr.length; j++){
//                System.out.print("("+curr+" ,"+arr[j]+" )");
//            }
//            System.out.println();
//        }
//    }



//    public static void subArray(int arrSub[]){
//        for(int i = 0; i<arrSub.length; i++){
//            for(int j=i; j<arrSub.length; j++){
//                for(int k=i; k<=j; k++){
//                    System.out.print(arrSub[k]);
//                }
//                System.out.println();
//            }
//        }
//    }


//    ...............palindrome.................................

    public static int palindrome(int a){
        int sonu = 0;

        while(a > 0){
            int lastDigit = a % 10;
            a = a / 10;
            sonu = sonu * 10 + lastDigit;
        }
        return sonu;

    }



//    public static int sumOfDigit(int num){
//        int sum = 0;
//
//        while(num>0){
//            int lastDigit = num % 10;
//            num = num / 10;
//            sum = sum + lastDigit;
//        }
//        return sum;
//    }


    public static int lS(int arr[], int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args){
//        int num[] = {9,7,5,3,1};

//        reverse(num);
//
//        for(int i=0; i<num.length; i++){
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();



//        int arr[] = {9,7,5,3,1};
//        printPair(arr);



//        int arrSub[] = {2,4,6,8,10,12};
//        subArray(arrSub);


//        System.out.println(palindrome(123));


//        System.out.println(sumOfDigit(123456789));




        int arr[] = {2,4,6,8,10,12};
        int key = 2;

        int index = lS(arr, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("At index: "+index);
        }
    }
}
