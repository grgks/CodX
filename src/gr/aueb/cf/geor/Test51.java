package gr.aueb.cf.geor;

public class Test51 {
    public static void main(String[] args) {
        int [] arr = {1, 5 ,8 ,9 ,10 ,15};
        boolean keyIsFound = false;
        final int KEY = 10;

        for (int i = 0 ; i < arr.length ; i++  ){
            if (arr[i] == KEY){
                arr[i] = KEY * 2;
            }
        }
        for (int item : arr){
            System.out.print(item + "");
        }
    }
}
