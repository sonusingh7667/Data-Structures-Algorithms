package Recursion;

public class POWER_Problem_04 {

    public static int optimizePower(int a, int n){

        if(n ==0){
            return 1;
        }
        int halfPower =optimizePower(a , n/2);
        int halfPowerSqt = halfPower * halfPower;


        //n is odd
        if(n % 2 != 0){
            halfPowerSqt = a* halfPowerSqt;
        }
        return halfPowerSqt;
    }



    public static void main(String[] args){

        System.out.println(optimizePower(2,5));
    }
}
