package gr.aueb.cf.geor;

public class Test71 {
    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simlpleName ;
        String nickName ;
        String oneName ;

        simlpleName = firstname.replace("-", " ");


        nickName = firstname.replace("-" , " ");
        System.out.println(nickName);

        oneName = firstname.replace("-Helen" , "");
        System.out.println(oneName);
}
}
