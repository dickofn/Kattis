import java.util.Scanner;

public class Parking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int mall = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int total = 0;
            for (int j = 0; j < mall; j++) {
                int input = sc.nextInt();
                if (input < min) {
                    min = input;
                }
                if (input > max) {
                    max = input;
                }
                total += input;
            }
            int mid = total / mall;
            int distance = 2 * ((mid - min) + (max - mid));
            System.out.println(distance);
        }
    }
}
