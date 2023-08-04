package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        /*EncapsExample example = new EncapsExample();
        example.show();  //  protected method
        example.display();  // public method

        */
        System.out.println("Hello Java !");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.nextLine();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();

    }

    /* BufferedRead is synchronous but scanner is not
        BufferedRead has a significantly larger memory for buffer (8 KB) as compare
        to 1 KB of Scanner
    *   Performance wise :
            - BufferedRead is bit faster as compared to Scanner the simple reason behind this is
            Scanner does the parsing of input and bufferedReader simply reads a sequence of
            characters.
    */
}
