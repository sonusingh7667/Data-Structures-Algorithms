package Recursion_part_2;

public class Friend_Pairs {

    public static int friendPairing(int n){

        if(n==1 || n==2){
            return n;
        }

        //single
//        int fnm1 = friendPairing(n-1);
//
//        //pairing
//        int fnm2 = friendPairing(n-2);
//        int pairWays = (n-1) * fnm2;
//
//        //totalways
//        int totways = fnm1+pairWays;
//        return totways;


        return friendPairing(n-1) + (n-1) * friendPairing(n-2);
    }



    public static void main(String[] args){

        System.out.println(friendPairing(8));
    }
}
