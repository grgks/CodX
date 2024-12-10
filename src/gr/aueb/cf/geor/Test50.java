package gr.aueb.cf.geor;

public class Test50 {
    public static void main(String[] args) {
        int [] quantities = {100, 200 ,300};
        int position = 0;
        int value = 200;

    position = getElementPosition(quantities, value);
        System.out.printf("Position %d, value%d",position,quantities[position]);

    }

    public static int getElementPosition(int[] arr , int value){
        if (arr == null) return  -1;

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == value){
                return i;
        }
    }return  -1;
}
}
