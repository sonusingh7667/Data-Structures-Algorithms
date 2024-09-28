package Greedy__Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class fractional_KnapSack {
    public static void main(String[] args){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int W = 50;

        Double ratio[][] = new Double[value.length][2];
        for (int i=0; i< value.length; i++){
            ratio[i][0] = (double)i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        //Accending Order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal =  0;
        for (int i = ratio.length-1; i>=0; i--){
            int idx = ratio[i][0].intValue();
            if (capacity >= weight[idx]){ //include full item
                finalVal += value[idx];
                capacity -= weight[idx];
            }
            else {
                //include fractional item
                finalVal +=(ratio[i][1] * capacity);
                capacity = 0;
                break;

            }
        }
        System.out.println("Final value : "+ finalVal);
    }
}
