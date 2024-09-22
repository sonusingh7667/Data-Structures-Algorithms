package Arrays_2D;

public class Spiral_Matrix {


    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCols = 0;
        int endRow = matrix.length - 1;
        int endCols = matrix[0].length-1;

        while (startRow <= endRow && startCols <= endCols) {

            //Top
            for (int j = startCols; j <= endCols; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //RIGHT
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCols]+" ");
            }

            //BOTTOM...
            for (int j = endCols - 1; j >= startCols; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCols == endCols) {
                    break;
                }
                System.out.print(matrix[i][startCols]+" ");
            }
            startRow++;
            startCols++;
            endCols--;
            endRow--;
        }
        System.out.println();


    }


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};


        printSpiral(matrix);
    }
}
