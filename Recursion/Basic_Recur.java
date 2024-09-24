package Recursion;

public class Basic_Recur {

    public static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);

    }

//    .........................................................

    public static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

//    ..................................................................................................


    public static int calcSum(int n){

        if(n==1){
            return 1;
        }

        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;

    }


    public static void main(String[] args){
        int n = 9;
        printDecreasing(n);
        printIncreasing(n);
        System.out.println("Total SUm is :"+calcSum(n));
    }
}
