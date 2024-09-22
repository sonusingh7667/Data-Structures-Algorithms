package DSA__Arrays;

public class Largest_value {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
//        int samllest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
//            if(samllest>numbers[i]){
//                samllest=numbers[i];
            }
//        }
        return largest;
//        return samllest;
    }


    public static void main(String[] args){
        int numbers[] = {1,3,5,6,3,8,2};

//        System.out.println("Largest value is:= "+getLargest(numbers));
        System.out.println("Samllest value is:= "+getLargest(numbers));
    }
}
