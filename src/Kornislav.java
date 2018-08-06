import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);

        System.out.println(input[0] * input[2]);
    }
}
