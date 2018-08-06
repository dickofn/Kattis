import java.util.HashMap;
import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int limit = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cases; i++) {
            String univ = sc.next();
            String team = sc.next();
            if (limit < 12) {
                if (map.get(univ) == null) {
                    map.put(univ, 1);
                    System.out.println(univ + " " + team);
                    limit++;
                }
            }
        }
    }
}
