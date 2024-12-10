package gr.aueb.cf.geor;

public class Test70 {
    public static void main(String[] args) {
        String s = "Athens University Of Economics And Business";
        int index = -1;

        for (int i = 0 ; i < s.length(); i ++){
            System.out.print(s.substring(i,i+1));

        }System.out.println();

        if(s.contains("Economics")) System.out.println("bingo");
        else System.out.println("false");

        index = s.indexOf("Uni");
        System.out.println("start index of uni: " + index );

        index = s.indexOf('t');
        System.out.println("start index of 't': " + index );

        index = s.lastIndexOf("t");
        System.out.println("start index 't' : " + index);

        index = s.indexOf('s');
        System.out.println("Start Index of 's' " + index);

        index = s.indexOf('s',7);
        System.out.println("Start of index 's' " + index);


    }
}
