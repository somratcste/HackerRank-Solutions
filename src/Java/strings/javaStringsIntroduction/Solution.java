package Java.strings.javaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.nextLine();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)> 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.printf("%s %s", capitalizeFirst(A), capitalizeFirst(B));
        /* Enter your code here. Print output to STDOUT. */

    }

    private static String capitalizeFirst(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
