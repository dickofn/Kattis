
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
public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jumlah = 0;
        double a = sc.nextDouble();
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            jumlah += a*b*c;
        }
        System.out.println(jumlah);
    }
    
}
