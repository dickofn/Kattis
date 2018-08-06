import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matches = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        //panjang maksimal dari pitagoras
        double m = Math.sqrt((w*w)+(h*h));
        for (int i = 0; i < matches; i++) {
            int n = sc.nextInt();
            if (n <= m) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
