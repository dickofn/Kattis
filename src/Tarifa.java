
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
public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int jml = (n+1)*x;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            jml -= p;
        }
        System.out.println(jml);
    }
}
