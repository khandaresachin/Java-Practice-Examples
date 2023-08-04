package batch2.exceptionExample;


public class FirstDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int division;
        /*try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception caused for divide by zero ");
        }*/

      /*  int division = calculateDivision(a, b);
        System.out.println("Division of two numbers is : " + division);*/
        division = arithmeticOperations(a, 0);
        System.out.println("Division of two numbers is : " + division);
    }
    public static int arithmeticOperations(int num1, int num2) throws ArithmeticException{
       int division = calculateDivision(num1, num2);
       return division;
    }
    public static int calculateDivision(int a, int b) {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return result;
    }
}
