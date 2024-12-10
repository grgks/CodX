package gr.aueb.cf.geor;

public class Test66 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,9};
        int low = 0;
        int high = arr.length -1;
        int position = -1;

        position = binarySearch(arr , 5, low , high);

        if (position == -1){
            System.out.println("value not found");

        }else {
            System.out.println("value found in position " + (position +1));
        }



    }

    public static int binarySearch(int[] arr , int value , int low , int high){
        int mid = 0;

        if(arr == null) return -1;
        if((low < 0) || (high > arr.length -1)) return  -1;
        if(high < low) return  -1;

        mid = (low + high) / 2;

        if (value == arr[mid] ){
            return  mid;
        }
        if (value < arr[mid]){
            return binarySearch(arr, value , low , mid -1);

        }
        else {
            return binarySearch(arr, value, mid + 1,high);
        }
    }
}


