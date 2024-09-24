package BackTraking;

//--Check if problem can be solved & print only 1 solution to N queens problem..........................................

public class Nqueen_Problem {

        public static boolean isSafe(char board[][], int row, int cols){
            //Vertical up
            for(int i= row-1; i>=0; i--){
                if(board[i][cols]== 'Q'){
                    return false;
                }
            }

            //Diagonal left up
            for (int i=row-1, j=cols-1; i>=0 && j>=0; i--, j--){
                if (board[i][j]=='Q'){
                    return false;
                }
            }

            //Diagonal Right Up

            for (int i=row-1, j=cols+1; i>=0 && j< board.length; i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }

        public static boolean NQueens(char board[][] , int row){
            //Base case
            if(row == board.length){
                printBoard(board);
                return true;
            }

            //Column loop
            for (int j=0; j< board.length; j++){
                if(isSafe(board , row , j)){
                    board[row][j] ='Q';
                    if (NQueens(board, row+1)){
                        return true;
                    }
                    board[row][j] = 'X';        // BackTracking Step.....
                }
            }
            return false;
        }

        public static void printBoard(char board[][]){
            System.out.println("___________________________CHESS BOARD_______________________");
            for (int i=0; i< board.length; i++){
                for (int j=0; j< board.length; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }


        public static void main(String[] args){

            int n=4;
            char board[][] = new char[n][n];
            //initialize
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    board[i][j] = 'X';
                }
            }
            if(NQueens(board, 0)){
                System.out.println("Solution is possible...");
                System.out.println(" ");
                printBoard(board);
            }
            else {
                System.out.println("Solution is not possible...");
            }
        }
    }




