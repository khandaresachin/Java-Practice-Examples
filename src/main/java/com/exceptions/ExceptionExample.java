package com.exceptions;

public class ExceptionExample {
    public static void main(String args[]){
        try {
            divideNumber();
        }catch (ArithmeticException e){
            System.out.println("Please enter non zero value for divident");
        }
    }

    private static void divideNumber() throws ArithmeticException {
        int a =10, b=0,c;
        c= a/b;


        /*try {
            c= a/b;
        }
        catch (NullPointerException e){
            System.out.println("NPE caused");
        }
        catch (ArithmeticException e){
            //System.out.println("Please enter non zero value for divident");
            throw new ArithmeticException("Divide by zero caused");
        }
        catch (RuntimeException r){
            System.out.println("RE caused");
        }finally {
            System.out.println("Finally ! Executed");
        }*/
    }
}

/*
    Exception:
            Exception is an unwanted, unexpected event, which may occur during execution or
            compilation of program.

        - Compiler time exception
            - checked exceptions:

        - Runtime time exception
            - unchecked exceptions

               int c = a/b;

               Student student = db.getStudentById(70);
               if(student.getMarks() > 75)
                    // do something

    Exception handling approaches:
        - try..catch block
        - finally block
        - throw and throws keyword


    try...catch block:
        - We write down the code under try which might cause the exception as well as in the catch block we
          handle the same exception.

        - We have to write the catch immediately after try block.
        - We can not have catch block separately without try block.
        - We can have any number of catch blocks for single try block.
        - The execution of catch block will depend on the cause of exception as well as the hierarchy of exceptions


    finally-
        - the finally block is always executed whether there is exception or not.
        - We can have only one finally block immediately after catch block.
        - We can not write finally block as separate block, it has to be written down post try.. catch
        - Example of scenarios where we should consider using finally block
                - closing db connections
                - closing IO streams
                - closing the any third party connections
                - Depends on the requirement of logic where we need some block of code to be executed
                    in both the case (exception case or no exception case)

    throw and throws:
        - throw  keyword is used to explicitly throw a single exception.


    Exception handling with method overriding
        - If the super class doesn't declare exception
                - subclass declares the checked exception
                - subclass declares the unchecked exception


    final finally and finalize

 */
