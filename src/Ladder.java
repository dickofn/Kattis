
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
public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        double hasil = h/Math.sin(Math.PI*v/180);
        System.out.println(Math.round(Math.ceil(hasil)));
    }
}
