import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String first = sc.next();
            String second = sc.next();

            System.out.println(first + "\n" + second);
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == second.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
    }
}
