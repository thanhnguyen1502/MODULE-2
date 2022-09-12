package draft.mono.execiseOOP;

import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("muốn nhập bao nhiều người: ");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
            System.out.println("stt: ");
            int stt = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("birth: ");
            String birth = scanner.nextLine();
            System.out.println("enter score marth: ");
            int marth = Integer.parseInt(scanner.nextLine());
            System.out.println("enter score literary: ");
            int literary = Integer.parseInt(scanner.nextLine());
            System.out.println("enter score english: ");
            int english = Integer.parseInt(scanner.nextLine());
            Candidate candidate = new Candidate(stt, name, birth, marth, literary, english);
            candidate.display();
        }
    }
}
