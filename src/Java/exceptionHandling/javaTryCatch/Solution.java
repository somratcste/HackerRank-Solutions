package Java.exceptionHandling.javaTryCatch;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.close();
            int division;
            division = a/b;
            System.out.println(division);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}