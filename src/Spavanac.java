
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
public class Spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        m -= 45;
        if (m < 0) {
            h-=1;
            m = 60 + m;
        }
        if (h < 0) {
            h = 24 + h;
        }

        System.out.println(h + " " + m);
    }
}
