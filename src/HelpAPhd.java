import java.util.Scanner;

public class HelpAPhd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String input = sc.next();
            String[] splitted = input.split("\\+");
            try {
                System.out.println(Integer.parseInt(splitted[0]) + Integer.parseInt(splitted[1]));
            } catch (Exception e) {
                System.out.println("skipped");
            }
        }
    }
}
