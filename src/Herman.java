import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        final double pi =  3.14159265359;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        System.out.println(pi * r * r);
        System.out.println(2 * r * r);
    }
}
