package batch2.stringexample;

public class StringAndBufferAndBuilderExample {

    public static void main(String[] args) {
        String str = "Hello! ";

        StrConcat(str);
        System.out.println("Final String is "+str);

        StringBuffer strBfr = new StringBuffer("Hello Buffer ");
        StrBufferConcat(strBfr);
        System.out.println("The Final String is "+ strBfr);

        StringBuilder strBlder = new StringBuilder("Hello Builder ");
        StrBuilderConcat(strBlder);
        System.out.println("The final string is "+ strBlder);
    }

    public static void StrConcat(String str){
        str = str + "World";
        System.out.println("From method string is "+ str);
    }

    public static void StrBufferConcat(StringBuffer strBfr){
        strBfr.append("World");
    }

    public static void StrBuilderConcat(StringBuilder strBldr){
        strBldr.append("World");
    }
}
