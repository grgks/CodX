package gr.aueb.cf.geor;

public class Test52 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9};


        replace(arr, 9, 10);
        printArr(arr);
    }





    public static void replace(int [] arr , int oldValue,int newValue ){
        int PositionToUpdate = -1;
        if(arr == null) return;
        PositionToUpdate = getElementPosition(arr , oldValue);
        if(PositionToUpdate != -1) arr [PositionToUpdate] = newValue;

    }

    public static int getElementPosition(int[] arr, int value){
        if (arr == null) return -1;
        for (int i =0 ; i < arr.length; i++ ){
            if(arr[i] == value){
                return i;
            }
        }return -1;
    }

    public static void printArr(int[]arr){
        for (int item : arr){
            System.out.print(item + " ");
        }
    }
}
