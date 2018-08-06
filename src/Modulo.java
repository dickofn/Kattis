
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
public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cek = new int[43];
        int total=0;
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (cek[a%42]==0) {
                cek[a%42]=1;
                total++;
            }
        }
        System.out.println(total);
    }
}
