import java.util.HashMap;
import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String input = sc.nextLine();
        String[] inputArr = input.split("\\s+");
        for (int i = 0; i < inputArr.length; i++) {
            if (map.get(inputArr[i]) == null) {
                map.put(inputArr[i], 1);
            } else {
                map.put(inputArr[i], map.get(inputArr[i]) + 1);
                System.out.println("no");
                break;
            }
            if (i == inputArr.length-1) {
                System.out.println("yes");
            }
        }
    }
}
