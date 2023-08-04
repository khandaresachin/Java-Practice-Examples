package batch2.stringexample;

public class StringLateralExample {

    public static void main(String[] args) {

        String s1="Java";
        String s2="Programming";
        String s3="Java";
        String s4="Programming";
        String s5="Java";
        String s6="Java Programming";
        String s7="java";
        String s8="programming";
        String s9="Programming";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println("******************");
        s2="Training";
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s9);

        System.out.println("***********");

        System.out.println(s5.equals(s7));
        System.out.println(s3.equals(s5));
    }
}
