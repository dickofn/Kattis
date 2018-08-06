import java.util.HashMap;
import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map;
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            map = new HashMap<>();
            int odd = 0;
            int man = sc.nextInt();
            for (int j = 0; j < man; j++) {
                int in = sc.nextInt();
                if (map.get(in) == null) {
                    map.put(in, 1);
                } else {
                    map.put(in, map.get(in) + 1);
                }
            }
            for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                int value = entry.getValue();
                if (value == 1) {
                    odd = key;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + odd);
        }
    }
}
