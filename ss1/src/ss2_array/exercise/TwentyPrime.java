package ss2_array.exercise;

public class TwentyPrime {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên ! ");
        int numbers = 2;
        int count = 0;
        while (count<20){
            boolean flag = true;
            for (int i = 2; i < numbers; i++) {
                if (numbers%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(numbers);
                count++;
            }
            numbers++;
        }
    }
}
