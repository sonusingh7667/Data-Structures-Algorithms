package BackTraking;

//............O(n)factorial

public class N_numberOfQuene {

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

    public static void NQueens(char board[][] , int row){
        //Base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //Column loop
        for (int j=0; j< board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';
                NQueens(board, row+1);   //Functional call
                board[row][j] = 'X';        // BackTracking Step.....
            }
        }
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
        NQueens(board, 0);
    }
}