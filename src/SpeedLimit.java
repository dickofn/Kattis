
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dickofn
 */
public class SpeedLimit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != -1) {
            int currTime = 0;
            int total = 0;
            for (int i = 0; i < input; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                total += a * (b - currTime);
                currTime = b;
            }
            System.out.println(total + " miles");
            input = sc.nextInt();
        }
    }
}
