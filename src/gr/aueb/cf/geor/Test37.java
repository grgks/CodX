package gr.aueb.cf.geor;

public class Test37 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);
        System.out.println("The sum of a + b = "+ sum);

    }

    public static int add(int a , int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
}