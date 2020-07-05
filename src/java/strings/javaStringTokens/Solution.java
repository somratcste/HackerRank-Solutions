package java.strings.javaStringTokens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        s = s.trim();
        String delimas = "[ !,?._'@]+";
        String[] tokens = s.split(delimas);

        if(s.equals("")) {
            System.out.println("0");
        } else {
            System.out.println(tokens.length);
        }
        for (String token: tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}
