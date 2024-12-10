package gr.aueb.cf.geor;

public class Test47 {
    public static void main(String[] args) {
        int [] grades = {4, 2 ,8 , 9 ,5 };

        grades(grades);
        printArr(grades);

    }

    public static void grades(int [] arr){
        for (int i = 0 ; i < arr.length; i++)
            arr[i] += 2;
    }

    public  static void printArr( int[] arr){
        for (int  item : arr){
            System.out.print(item + ". ");
        }
    }
}
