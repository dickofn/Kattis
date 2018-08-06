import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        float x = limit, y = 0;
        for (int i = 0; i < limit; i++) {
            float a = sc.nextInt();
            if (a < 0) {
                x--;
            } else {
                y+=a;
            }
        }
        System.out.println(y/x);
    }
}
