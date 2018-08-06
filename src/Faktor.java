import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        int i = sc.nextInt();
        float aibig = a*i;
        float aismall = a*(i-1);
        for (float j = aismall; j <= aibig; j++) {
            if (Math.ceil(j/a) == i){
                System.out.println((int)j);
                break;
            }
        }
    }
}
