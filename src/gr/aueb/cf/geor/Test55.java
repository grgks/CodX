package gr.aueb.cf.geor;

public class Test55 {
    public static void main(String[] args) {


    int [] arr = {7,6,2,9,10,1,6,6,7};
    int minPosition = 0;
    int minValue = arr[minPosition];

for (int i = 1 ; i < arr.length; i++ ){
    if (arr[i] < minValue){
        minPosition = i;
        minValue = arr[minPosition];
    }
}
        System.out.printf("Min value %d, Min position %d", minValue,minPosition + 1);
    }
}
