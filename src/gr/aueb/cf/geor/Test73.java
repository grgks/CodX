package gr.aueb.cf.geor;

public class Test73 {
    public static void main(String[] args) {
        String s1 ="Athens" ;
        String s2 ="Athens" ;
        String s3 ="London" ;
        String s4 ="ATHENS" ;

        boolean isEqual;

        isEqual = s1.equals(s2);
        if(isEqual) System.out.println("Bingo");
        else System.out.println("Bongo");


        isEqual = s1.equals(s3) ;
        if(isEqual) System.out.println("Bingo");
        else System.out.println("Bongo");


       if (s2.compareTo(s3) > 0) {
           System.out.println("s1 > s3");
       }else System.out.println("s1 < s3");


        isEqual = s1.equalsIgnoreCase(s4);
        if(isEqual) System.out.println("Bingo");
        else System.out.println("Bongo");

    }
}
