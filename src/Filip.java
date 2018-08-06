import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filip f = new Filip();
        int a = sc.nextInt();
        a = f.reverse(a);
        int b = sc.nextInt();
        b = f.reverse(b);
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }
}