package ss11_stack_queue.exrcise;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isBracket(String str){
        Stack<Character> leftBracketStack = new Stack<>();

        char[] chars = str.toCharArray();

        String left;
        for (char aChar : chars) {
            if (aChar == '(') {
                leftBracketStack.push(aChar);
            } else if (aChar == ')') {
                if (leftBracketStack.isEmpty()) {
                    return false;
                } else {
                    left = String.valueOf(leftBracketStack.pop());
                }
                if (!left.equals("(")) {
                    return false;
                }
            }
        }
        return leftBracketStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Enter a expression: ");
        String str = scanner.nextLine();

        System.out.println(isBracket(str));
    }
}
