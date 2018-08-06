import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (r != 0 || l != 0) {
            if (l == r) {
                System.out.println("Even " + (l * 2));
            } else if (l > r) {
                System.out.println("Odd " + (l * 2));
            } else if (r > l) {
                System.out.println("Odd " + (r * 2));
            }
        } else
        {
            System.out.println("Not a moose");
        }
    }
}
