
import static java.time.Clock.system;
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
public class Parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] harga = {a, b, c};
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int max = a2;

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if (b2 > max) {
            max = b2;
        }

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c2 > max) {
            max = c2;
        }

        int time = 0;
        int jumlah = 0;
        while (time <= max) {
            int car = 0;
            if (time >= a1) {
                car++;
            }
            if (time >= b1) {
                car++;
            }
            if (time >= c1) {
                car++;
            }
            if (time >= a2) {
                car--;
            }
            if (time >= b2) {
                car--;
            }
            if (time >= c2) {
                car--;
            }
            if (car > 0) {
                jumlah += car * harga[(car - 1)];
                //System.out.println(time + " mobil " + car + " " + jumlah);
            }
            time++;
        }
        System.out.println(jumlah);
    }
}
