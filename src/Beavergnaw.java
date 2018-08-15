import java.util.Scanner;

public class Beavergnaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D = sc.nextInt();
        double V = sc.nextInt();
        double pi = Math.PI;
        while (D != 0 && V != 0) {
            double d = Math.cbrt(Math.pow(D, 3) - (6 * V / pi));
            System.out.println(d);
            D = sc.nextInt();
            V = sc.nextInt();
        }
    }
}
/* The Part that Eaten By the Beaver
V = CYL - 2*CON + 2*con - cyl |||| hCone = D/2 or d/2
V = (pi * 0.5D^2 * D) - (2 * pi * 0.5D^2 * D/6) + (2 * pi * 0.5d^2 * d/6) - (pi * 0.5d^2 * d)
V / pi = D^3/4 - D^3/12 + d^3/12 - d^3/4
V / pi = D^3/6 - d^3/6
6V / pi = D^3 - d^3
d^3 = D^3 - (6V / pi)
*/