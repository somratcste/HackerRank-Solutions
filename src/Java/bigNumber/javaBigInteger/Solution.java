package Java.bigNumber.javaBigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        scanner.close();

        BigInteger sum, mul;
        sum = a.add(b);
        mul = a.multiply(b);

        System.out.println(sum);
        System.out.println(mul);
    }
}
