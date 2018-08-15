import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            char[] enc = sc.next().toCharArray();
            String dec = "";
            int iter = (int)Math.sqrt(enc.length);
            for (int j = 0; j < iter; j++) {
                for (int k = 1; k <= iter; k++) {
                    dec += enc[iter*k-j-1];
                }
            }
            System.out.println(dec);
        }
    }
}
