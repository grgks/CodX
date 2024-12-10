package gr.aueb.cf.geor;

public class Test48 {
    public static void main(String[] args) {

        int [] ages = {1,2};
    printArray(ages);
    System.out.println();
        swap(ages);
        printArray(ages);
    }



    public static void swap(int[] arr) {
        if (arr.length  != 2) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
    public  static void printArray(int[] arr){
        for (int item : arr){
            System.out.println(item + "");

        }
    }
}


