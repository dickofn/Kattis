import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        boolean hiss = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 's' && arr[i+1] =='s') {
                hiss = true;
            }
        }
        if (hiss) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
