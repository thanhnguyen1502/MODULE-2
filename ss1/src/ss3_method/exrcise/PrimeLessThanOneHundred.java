package ss3_method.exrcise;

public class PrimeLessThanOneHundred {
    public static void main(String[] args) {
        int numbers = 2;
        while (numbers < 100) {
            boolean flag = true;
            for (int i = 2; i < numbers; i++) {
                if (numbers % i == 0) {
                    flag = false;
                    System.out.println(flag);
                    break;
                }
            }
            if (flag) {
                System.out.println(numbers);
            }
            numbers++;
        }
    }
}
