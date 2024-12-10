package gr.aueb.cf.geor;

public class Test57 {
    public static void main(String[] args) {
        int [] grades = {4,8,10,3,6,2,1,4};
        int minPosition = 0;

        minPosition = getMinPosition(grades, 0, args.length -1);

        System.out.printf("Min value: %d, Min position: %d",grades[minPosition] , minPosition +1);

    }
    public static int getMinPosition(int [] arr, int low, int high ){
       int minPosition = low;
       int minValue = 0;

       if( (low < 0) || (high > arr.length -1) ){
           System.out.println("Error in array dimension");
           return -1;
       }
       minValue = arr[low];
       for (int i = 0; i < arr.length ; i++ ){
           if (arr[i] < minValue){
               minPosition = i;
               minValue = arr[i];
           }
       }
       return minPosition;
    }

}
