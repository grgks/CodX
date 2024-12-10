package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MIN = 60;
        int inputSec = 0 ;
        int days = 0;
        int hour = 0;
        int min = 0;
        int remainSec = 0;



        System.out.println("Παρακαλω εισαγετε δευτερολεπτα");
        inputSec = scanner.nextInt();
        remainSec = inputSec;

        days = remainSec / DAY;
        remainSec = remainSec % DAY;

        hour = remainSec / HOUR;
        remainSec = remainSec % HOUR;

        min = remainSec / MIN;
        remainSec = remainSec % MIN;




        System.out.printf("Τα %d ειναι %d , %d , %d , %d", inputSec , days , hour ,min , remainSec);



}
}
