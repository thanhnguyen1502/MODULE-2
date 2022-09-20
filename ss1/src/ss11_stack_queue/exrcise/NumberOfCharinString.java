package ss11_stack_queue.exrcise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberOfCharinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine();
        String string1 = string.toLowerCase();
        Map<Character, Integer> charlist = new TreeMap<>();
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == ' ') {
                continue;
            }
            if (!charlist.containsKey(string1.charAt(i))) {
                charlist.put(string1.charAt(i), 1);
            } else charlist.replace(string1.charAt(i), charlist.get(string1.charAt(i)) + 1);
        }
        System.out.println(charlist);

    }
}
