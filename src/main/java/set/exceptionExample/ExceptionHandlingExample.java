package batch2.exceptionExample;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int num1 = 100, num2=0;
        try {
            performAnyArithmeticOperation(num1, num2);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred");
        }finally {
            System.out.println("Finally block is called");
        }
    }

    public static void performAnyArithmeticOperation(int num1, int num2) {
        try {
            System.out.println("Sum of two numbers is: " + getSum(num1, num2));
            System.out.println("Division of two numbers is: " + getDivision(num1, num2));
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }

    public static int getSum(int num1, int num2)throws ArithmeticException{
        return num1 + num2;
    }
    public static int getDivision(int num1, int num2){
        return num1/num2;
    }
}
