package Java.dataStructures.javaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int totalLines = scanner.nextInt();
        for (int count = 0; count < totalLines; count++) {
            int lineNumber = scanner.nextInt();
            List<Integer> integerList = new ArrayList<>();
            for (int lineCount = 0; lineCount < lineNumber; lineCount++) {
                integerList.add(scanner.nextInt());
            }
            lists.add(integerList);
        }

        int totalQueries = scanner.nextInt();
        for (int queryCount = 0; queryCount < totalQueries; queryCount++) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            try {
                System.out.println(lists.get(row-1).get(column-1));
            } catch (Exception exception) {
                System.out.println("ERROR!");
            }
        }
    }
}
