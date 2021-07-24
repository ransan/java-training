package geeksforgeeks.array.IPK.dynamic_programming.tabulation;

public class GridTraveler {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] grid = new int[m + 1][n + 1];
        grid[1][1] = 1;
        System.out.println(travelerCount(grid, m, n));
    }

    private static int travelerCount(int[][] grid, int m, int n) {
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if ((j + 1) <= n)
                    grid[i][j + 1] += grid[i][j];
                if ((i + 1) <= m)
                    grid[i + 1][j] += grid[i][j];
            }
        }
        return grid[m][n];
    }
}
