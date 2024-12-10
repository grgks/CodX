package gr.aueb.cf.geor;



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int mul = 0;
        int sub = 0;
        int div = 0;
        int mod = 0;

        System.out.println("Παρακαλω εισαγετε δυο ακεραιους");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = a + b;
        mul = a * b;
        sub = a - b;
        div = a / b;
        mod = a % b;

        System.out.printf("αρθροισμα %d , γινομενο: %d ,  Αφαιρεση: %d ,  διαιρεση: %d  και  πηλικο: %d", sum ,mul ,sub ,div ,mod);

    }
}
