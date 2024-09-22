package DSA__Arrays;

public class LinearSearch {
//    public static int linearSearch(int numbers[], int key){
//
//        for(int i=0; i<numbers.length; i++){
//            if(numbers[i] == key){
//                return i;
//
//            }
//        }
//        return -1;
//    }

//    .....................................................................................................................

//    public static int linearSearch(String Menu[], String key){
//
//        for(int i=0; i<Menu.length; i++){
//            if(Menu[i] == key){
//                return i;
//            }
//        }
//        return -1;
//    }

//    #####################################BY----OWN############################################

    public static int linearSearch(int num[], int key){

        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }





    public static void main(String[] args){
//        int numbers[] = {2,4,6,8,10,12,14,16};
//        int key = 10;
//        int index = linearSearch(numbers,key);
//        if(index==-1){
//            System.out.println("Not Found");
//        }
//        else{
//            System.out.println("key is at index:-" +index);
//        }

//        .........................................................................................................

//        String items[] = {"apple", "banana", "cherry", "date", "fig", "grape"};
//        String key = "grape";
//        int index = linearSearch(items, key);
//        if (index == -1) {
//            System.out.println("Not Found");
//        } else {
//            System.out.println("Key is at index: " + index);
//        }

// ################################################################################################


    int num[] = {2,4,6,8,10,12,14,16};
    int key = 14;

    int index = linearSearch(num, key);
    if(index == -1){
        System.out.println("NOT FOUND");
    }
    else{
        System.out.println("At Index:= "+index);
    }

    }
}

