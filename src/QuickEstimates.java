import java.util.Scanner;

public class QuickEstimates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            char[] number = sc.next().toCharArray();
            System.out.println(number.length);
        }
    }
}
