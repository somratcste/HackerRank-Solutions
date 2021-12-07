package Java.dataStructures.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int totalPhoneBook = Integer.parseInt(scanner.nextLine());
        Map<String, String> phoneBook = new HashMap<>();
        for (int count = 0; count < totalPhoneBook; count++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            phoneBook.put(name, number);
        }

        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
