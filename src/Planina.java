import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        //Rumusnya (2^iterasi+1)^2
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((int)Math.pow(Math.pow(2, x)+1, 2));
    }
}
