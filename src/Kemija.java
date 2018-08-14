import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] enc = sc.nextLine().toCharArray();
        String dec = "";
        for (int i = 0; i < enc.length; i++) {
            if (enc[i] == 'a' || enc[i] == 'i' || enc[i] == 'u' || enc[i] == 'e' || enc[i] == 'o') {
                dec += enc[i];
                i += 2;
            } else {
                dec += enc[i];
            }
        }
        System.out.println(dec);
    }
}
