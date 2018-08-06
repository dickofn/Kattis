import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (((x * 4) + (y * 3)) % 2 != 0) {
            System.out.println("impossible");
        } else {
            System.out.println("possible");
        }
    }
}
