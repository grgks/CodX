package gr.aueb.cf.ch1;

/**calculate the sum of two integers
 * and the result is printed at console
 */

public class AddApp {
    public static void main(String[] args) {
        //δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //entoles
        result = num1 + num2;

        //Εκτυπωση του αποτελεσματος
        System.out.println("Το αποτέλεσμα είναι: "+ result);
        System.out.printf("το αθροισμα των " + num1 +","+ num2 + "ειναι ισο με :" + result );
        System.out.printf("Το αθροισμα των %d , %d ειναι ισο με  : %d\n" , num1, num2 , result); // decimal
    }
}
