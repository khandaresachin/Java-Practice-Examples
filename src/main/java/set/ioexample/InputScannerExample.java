package batch2.ioexample;

import java.util.Scanner;

public class InputScannerExample {

    public static void main(String args[]){
        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Hello "+ name+ " Your age is "+ age);

    }
}
