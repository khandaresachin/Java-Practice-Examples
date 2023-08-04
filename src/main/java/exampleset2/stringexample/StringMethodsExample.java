package batch2.stringexample;

public class StringMethodsExample {
    public static void main(String[] args) {
        String strObj1 = new String("Programming");

        String strObj2 = new String("Programming");

        String strObj3 = new String("Java Programming");

        String str1 = "Programming";   // created and referenced from SCP

        String str2 = "programming"; // reference to existing string from SCP

        String str3 = "Java Programming";  // create and reference from SCP

        if(strObj1.equals(strObj2)){   // equals method the content of both the strings are checked
            System.out.println("String objects are equal with value");
        }else {
            System.out.println("String objects are not equal with value");
        }

        if(strObj1 == strObj2){  // == operator when used with two strings will evaluate based on
                                // memory reference at which two objects are
            System.out.println("String objects are equal with memory reference");
        }else {
            System.out.println("String objects are not equal with memory reference");
        }

        if(str1.toLowerCase() == str2.toLowerCase()){
            System.out.println("String literals are equal with memory reference");
        }else {
            System.out.println("String literals are not equal with memory reference");
        }
        System.out.println(str1);

        if(str1.equals(str2.toLowerCase())){
            System.out.println("String literals are equal with value");
        }else {
            System.out.println("String literals are not equal with value");
        }

        // Further string class methods

        String temp = str3.concat(str1);

        System.out.println(temp);
        System.out.println(str1);
        System.out.println(str3);

        System.out.println("******************************");
        //System.out.println(str1.charAt(11));// example of StringIndexOutOfBoundException where
        // we are trying to fetch the character from string at index out of strings length.

        System.out.println(str1.charAt(0)); // This will return the 0th index character for str1
        // str1 -- Programming
        System.out.println(str3.contains(str1));

        String str = "mmin";

        System.out.println(str1.contains(str)); // Checks if similar character sequence is available
        // within the string or not

        System.out.println("###################################");

        System.out.println(str1.getBytes());

        System.out.println(str1.startsWith("mming"));

        System.out.println(str1.endsWith("mming"));
    }
}
