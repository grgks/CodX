package gr.aueb.cf.geor;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Παρακαλω εισαγετε εαν βρεχει (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Παρακαλω εισαγετε τη θερμοκρασια");
        temp = in.nextInt();
        isSnowing = isRaining && (temp < 0);

        System.out.printf("Χιονιζει: " + isSnowing);
    }
}
