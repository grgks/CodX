package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert sum of the grades ");
        totalMarks = sc.nextInt();
        System.out.println("Please insert modules count");
        modulesCount = sc.nextInt();

        if (modulesCount == 0){
            System.out.println("Modules can not be zero");
            System.exit(1);
        }

        average = totalMarks / modulesCount ;

        if (average  < 0 || average > 10){
            System.out.println("Wrong data input");
        }else if (average >= 9){
            System.out.println("Excelent:" + average);
        }else if (average >= 7){
            System.out.println("Very Good :" + average);
        }else if (average >= 5){
            System.out.println("Good :" + average);
        }else {
            System.out.println(" Sorry next time"+ average);
        }

    }
}
