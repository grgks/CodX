package gr.aueb.cf.geor;

public class Test72 {
    public static void main(String[] args) {
        String firstname = "Athanassios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullname1, fullname2, fullname3, fullname4;

        fullname1 = firstname +" "+ lastname;
        fullname2 = title + firstname + " " + lastname;

        fullname3 = firstname.concat(" ").concat(lastname);
        fullname4 = title.concat(firstname).concat(" ").concat( lastname);

        System.out.printf("Firstname: %s,  \nLastname: %s. " ,firstname,lastname);
        System.out.println();
        System.out.printf("Full name 1: %s ",fullname1);
        System.out.println();
        System.out.printf("Full name 2: %s ",fullname2);
        System.out.println();
        System.out.printf("Full name 3: %s ",fullname3);
        System.out.println();
        System.out.printf("Full name 4: %s ",fullname4);

    }
}
