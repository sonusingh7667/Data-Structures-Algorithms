package Recursion;

public class Fibonacci {

    public static int Fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        int nm1 = Fibonacci(n-1);
        int nm2 = Fibonacci(n-2);
        int fn = nm1+nm2;
        return fn;
    }



    public static void main(String [] args){
        int n = 4;
        System.out.println(Fibonacci(n));
    }
}
