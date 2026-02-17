
class Solution {

    static void solve(int[][] maze, int i, int j, int n, boolean[][] visited, String path) {

        // base case: destination reached
        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        // mark current cell visited
        visited[i][j] = true;

        // Down
        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(maze, i + 1, j, n, visited, path + "D");
        }

        // Right
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(maze, i, j + 1, n, visited, path + "R");
        }

        // Up
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(maze, i - 1, j, n, visited, path + "U");
        }

        // Left
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(maze, i, j - 1, n, visited, path + "L");
        }

        // backtrack
        visited[i][j] = false;
        false false false...
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1) {
            solve(maze, 0, 0, n, visited, "");
        }
    }
}
