package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MIN = 60;
        int inputSec = 0;
        int inputDay = 0;
        int inputHour = 0;
        int inputMin = 0;
        int sumSec = 0;

        System.out.println("Πaρακαλω εισαγετε μερες , ωρες , λεπτα , δευτερολεπτα");
        inputDay = scanner.nextInt();
        inputHour = scanner.nextInt();
        inputMin = scanner.nextInt();
        inputSec = scanner.nextInt();

        sumSec = (inputDay * DAY) + (inputHour * HOUR) + (inputMin * MIN) + inputSec ;

        System.out.printf("Τα δευτερολεπτα ειναι: %,d",sumSec);




    }
}
