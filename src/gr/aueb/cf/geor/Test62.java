package gr.aueb.cf.geor;

public class Test62 {
    public static void main(String[] args) {

        int [] [] arr = new int [3] [];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];

        for (int [] row : arr){
            for (int col : row){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }
}
