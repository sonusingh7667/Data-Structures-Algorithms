package MatrixLeetCode;

public class SetMatrixZeros {

    //Brute Force Approach
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {

                    // mark row
                    for (int k = 0; k < n; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }

                    // mark column
                    for (int k = 0; k < m; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }

        // convert -1 to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }



    //optimal solution
    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            int col0 = 1;

            // step 1: mark
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) col0 = 0;

                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // step 2: update inner matrix
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // step 3: first row
            if (matrix[0][0] == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            // step 4: first column
            if (col0 == 0) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }





    public static void main(String[] args){
        int matrix[][] = {{1,1,1},
                        {1,0,1},
                        {1,1,1}};

        setZeroes(matrix);
    }
}
