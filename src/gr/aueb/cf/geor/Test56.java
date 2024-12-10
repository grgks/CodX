package gr.aueb.cf.geor;

public class Test56 {
    public static void main(String[] args) {
        int [] arr = {4,6,8,9,8,2,11};
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value :%d , Min position :%d",minValue ,minPosition +1);
    }
}
