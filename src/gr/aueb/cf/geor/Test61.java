package gr.aueb.cf.geor;

public class Test61 {
    public static void main(String[] args) {
        int [][] grid = {{1,2}, {3,4}, {5,6}};


        for (int[] row : grid){
            for (int col :row ){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
