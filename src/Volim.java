
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dicko
 */
public class Volim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 210;
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char z = sc.next().charAt(0);
            time -= t;
            if (time < 0) {
                break;
            }
            if (z == 'T') {
                k++;
            }
            if (k > 8) {
                k = 1;
            }
        }
        System.out.println(k);
    }
}
