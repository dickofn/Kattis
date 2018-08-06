import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean fun = false;
            if (a + b == c) {
                fun = true;
            } else if (a * b == c) {
                fun = true;
            } else if (Math.abs(a - b) == c) {
                fun = true;
            } else if ((float)a / b == (float)c) {
                fun = true;
            } else if ((float)b / a == (float)c) {
                fun = true;
            }
            if (fun) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
