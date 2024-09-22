package Arrays_2D;

import java.util.Scanner;

public class Matrixs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][]matrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if(matrix[i][j] == x){
                    System.out.println("("+i+" ,"+j+" )");
                }
            }
        }

//        for (int i=0; i<rows; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(matrix[i][j] +" ");
//            }
//            System.out.println();
//        }
    }
}
