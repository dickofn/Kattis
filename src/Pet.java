
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
public class Pet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int baris = 0;
        int barisfix = 0;
        for (int i = 0; i < 5; i++) {
            baris++;
            int jumlah = 0;
            int a = 0;
            for (int j = 0; j < 4; j++) {
                a = sc.nextInt();
                jumlah += a;
            }
            if (jumlah > max) {
                max = jumlah;
                barisfix = baris;
            }
        }
        System.out.println(barisfix + " " + max);
    }
}
