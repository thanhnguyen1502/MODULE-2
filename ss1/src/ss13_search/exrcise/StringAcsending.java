package ss13_search.exrcise;

import java.util.LinkedList;
import java.util.Scanner;

public class StringAcsending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> listMax = new LinkedList<>();
        System.out.println("Nhập vào chuỗi: ");
        String myString = scanner.nextLine();
        for (int i = 0; i < myString.length(); i++) {
            if (list.size() > 1 && myString.charAt(i) < list.getLast()) {
                list.clear();
            }
            list.add(myString.charAt(i));
            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }
        for (Character c : listMax) {
            System.out.println(c);
        }
    }
}
