package Recursion;

public class Recursion_Rough {

    public static void Dec(int n) {

        if(n == 1){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        Dec(n-1);

    }
    public static void main(String[] args){
        int n = 15;
        Dec(n);
    }
}
