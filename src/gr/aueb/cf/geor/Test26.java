package gr.aueb.cf.geor;

public class Test26 {
    public static void main(String[] args) {


    int sum = 0;
    int mul =1;


    for ( int i = 1; i <= 10 ; i++ ){
        sum += i;
        mul *= i;
    }
        System.out.println("Sum :" + sum);
        System.out.println("Mul :" +mul);
}
}
