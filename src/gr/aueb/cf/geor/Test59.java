package gr.aueb.cf.geor;

public class Test59 {
    public static void main(String[] args) {
        int [] grades = {1,2,2,4,5,5,0,4,5,2,2,1};
        int [] counts = new int [6];

        for (int grade : grades ){
            counts[grade]++;
        }
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Grade %d: %.2f%%\n", i , (double) counts[i] / grades.length);
        }
    }
}
