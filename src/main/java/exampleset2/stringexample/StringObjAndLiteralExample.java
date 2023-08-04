package batch2.stringexample;

public class StringObjAndLiteralExample {
    public static void main(String[] args) {
        String strObj1 = new String("Java");

        String str1 = "Java"; // this will be created in SCP

        String strObj2 = new String("Java");

        String str2 = "Java"; // will reference to the existing Java String in SCP

        if (str1 == str2){
            System.out.println("Two string are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}