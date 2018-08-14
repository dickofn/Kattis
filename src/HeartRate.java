import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            double beat = sc.nextDouble();
            double seconds = sc.nextDouble();
            double tMin = seconds / (beat - 1);
            double tMax = seconds / (beat + 1);
            double abpmMin = 60 / tMin;
            double bpm = 60 * beat / seconds;
            double abpmMax = 60 / tMax;
            System.out.println(abpmMin + " " + bpm + " " + abpmMax);
        }
    }
}
