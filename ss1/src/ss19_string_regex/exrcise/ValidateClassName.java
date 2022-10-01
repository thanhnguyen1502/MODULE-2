package ss19_string_regex.exrcise;

public class ValidateClassName {
    public static void main(String[] args) {
        String regex = "^[CAP][0-9]{4}[GHIKLM]$";
        String[] arr = {"C0318G","M0318G","P0323A","C0422G"};
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(check= arr[i].matches(regex));
        }
    }
}
