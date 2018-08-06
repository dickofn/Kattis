import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        System.out.println(star + ":");
        for (int i = 2; i <= Math.ceil((double)star/2); i++) {
            for (int j = 1; j <= i; j++) {
                int total = 0;
                while (total < star) {
                    total += i;
                    if (total < star) {
                        total+= j;
                    }
                }

                if (total == star && Math.abs(i-j) <= 1) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
