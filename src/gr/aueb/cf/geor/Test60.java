package gr.aueb.cf.geor;

public class Test60 {
    public static void main(String[] args) {
        int [][] grid = new int[3][3];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[0][2] = 6;
        grid[1][0] = 2;
        grid[1][1] = 3;
        grid[1][2] = 7;
        grid[2][0] = 4;
        grid[2][1] = 5;
        grid[2][2] = 8;
        for (int[] row : grid){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
