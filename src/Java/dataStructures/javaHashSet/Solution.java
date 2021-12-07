package Java.dataStructures.javaHashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int totalParis = Integer.parseInt(scanner.nextLine());
        Set<String> pairs = new HashSet<>();
        for (int count =0; count<totalParis; count++) {
            pairs.add(scanner.nextLine());
            System.out.println(pairs.size());
        }
    }
}
