package Java.dataStructures.javaList;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        int N = scanner.nextInt();
        for (int count = 0; count < N; count++) {
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int count = 0; count < Q; count++) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                L.add(index, value);
            } else if (query.equals("Delete")) {
                int deletePosition = scanner.nextInt();
                L.remove(deletePosition);
            }
        }
        scanner.close();
        for (Integer number: L) {
            System.out.printf(number + " ");
        }
    }
}
