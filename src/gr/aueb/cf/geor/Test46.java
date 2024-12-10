package gr.aueb.cf.geor;

public class Test46 {
    public static void main(String[] args) {
        int [] ages = {2, 3, 4 ,5 ,6, 7};

        printArray(ages, 2 , ages.length -1);
        System.out.println("");
        printArray(ages, 1 , ages.length -2);

    }
    public static void printArray(int[] arr, int low , int high){
        if(( low < 0) || ( high > arr.length -1)) return;
        for (int i = low ; i <= high ; i++){
            System.out.print(arr[i] + "");
        }

    }
}
