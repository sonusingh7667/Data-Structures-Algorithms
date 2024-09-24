package PRACTICE_PRACTICE_PRACTICE;

public class Arrays {

//    public static void upDate(int marks[]){
//        for(int i=0; i<marks.length; i++){
//            marks[i] = marks[i]+1;
//        }
//    }


    public static boolean integers(int nums[]){
        for(int i=0; i< nums.length-1; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
//        int marks[] = new int[100];
//         marks[0] = 90;
//        marks[1] = 99;
//        marks[2] = 85;
//        marks[3] = 78;
//        marks[4] = 88;
//        marks[5] = 65;
//        marks[6] = 49;
//        System.out.println(marks[3]);
//        System.out.println(marks.length);

//        int marks[] = {23,45,65,87,92,68,72};
//
//        for(int i=0; i<marks.length; i++){
//            marks[i] = marks[i]+2;
//            System.out.print(marks[i]+"  ");
//        }


//        String fruits[] = {"apple", "banana", "guava", "mango", "papaya"};
//        System.out.println(fruits[3]);
//        System.out.println(fruits.length);

//        int marks[] = {299, 49, 99};

//       upDate(marks);
//
//       for(int i=0; i<marks.length; i++){
//           System.out.println(marks[i]+" ");
//       }
//        System.out.println();

//        for(int i=0; i<marks.length; i++){
//            marks[i] = marks[i]+1;
//            System.out.println(marks[i]+" ");
//        }
//        System.out.println();


//        int marks[] = {22,45,67,89,98,6,4};
//        int  n=0;
//        for(int i=0; i<marks.length; i++){
//            marks[i] = marks[i]+1;
//            System.out.print(marks[i]+" ");
//        }


        int nums[] ={1,2,3};

        System.out.println(integers(nums));
    }
}
