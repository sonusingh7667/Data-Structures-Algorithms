package BackTraking;

public class Sudoku_Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for (int i=0; i<=8; i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }

        //row
        for (int j =0;  j <=8; j++){
            if (sudoku[row][j] == digit){
                return false;
            }
        }

        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3X3 grid
        for (int i=sr; i<sr+3; i++){
            for (int j=sc; j<sc+3; j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //BAse case
        if (row == 9 && col == 0){
            return true;
        }

        //Recursion
        int nextRow = row, nextCol = col+1;
        if (col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++){
            if (isSafe(sudoku,row, col, digit)){
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                          {4, 9, 0, 1, 5, 7, 0, 0, 2},
                          {0, 0, 3, 0, 0, 4, 1, 9, 0},
                          {1, 8, 5, 0, 6, 0, 0, 2, 0},
                          {0, 0, 0, 0, 2, 0, 0, 6, 0},
                          {9, 6, 0, 4, 0, 5, 3, 0, 0},
                          {0, 3, 0, 0, 7, 2, 0, 0, 4},
                          {0, 4, 9, 0, 3, 0, 0, 5, 7},
                          {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if (sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists...");
            printSudoku(sudoku);
        }
        else {
            System.out.println("Solution does not exits...");
        }
    }
}






//////  LeetCode Solution for sudoku game

public class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean isSafe(char[][] board, int row, int col, char c) {

        //row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            }
        }
        //column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) {
                return false;
            }
        }
        //grid
        int subRow = (row / 3) * 3;
        int subCol = (col / 3) * 3;
        for (int i = subRow; i < subRow + 3; i++) {
            for (int j = subCol; j < subCol + 3; j++) {
                if (board[i][j] == c) {
                    return false;
                }
            }
        }
        return true;
    }



    public boolean solve(char[][] board) {
      
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
               
                if (board[row][col] == '.') {
                   
                    for (char c = '1'; c <= '9'; c++) {
                        if (isSafe(board, row, col, c)) {
                            board[row][col] = c; 

                            if (solve(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}




