package gr.aueb.cf.geor;

public class Test58 {
    public static void main(String[] args) {
       int [] grades = {7,6,2,9,10,4,11,6,7};
       int minPosition = 0 ;
       int maxPosition = 0;
       int minValue = grades[0];
       int maxValue = grades[0];

       for (int i = 0 ; i < grades.length; i++){
           if (grades[i] < minValue){
               minPosition = i ;
               minValue = grades[i];
           }

           if(grades[i] > maxValue){
               maxPosition =  i;
               maxValue = grades[i];
           }
       }



        System.out.printf("Max value :%d , Max position :%d",maxValue ,maxPosition +1);
        System.out.println();
        System.out.printf("Min value :%d , Min position :%d",minValue, minPosition +1);
    }
}

