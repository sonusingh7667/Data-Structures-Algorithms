package Recursion_part_2;

public class Tilling_Preblem_05 {

    public static int tillingProblem(int n){
        //BASE CASE
        if(n == 0 || n == 1){
            return 1;
        }
        //KAAM
        //VERTICAL CASE
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }


    public static void main(String[] args){

        System.out.println(tillingProblem(7));
    }
}
