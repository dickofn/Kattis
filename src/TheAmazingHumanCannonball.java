
import static java.lang.Math.cos;
import static java.lang.Math.sin;
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
public class TheAmazingHumanCannonball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double v = sc.nextDouble();
            double teta = sc.nextDouble();
            double x = sc.nextDouble();
            double h1 = sc.nextDouble();
            double h2 = sc.nextDouble();
            double t = x / (v * cos(Math.toRadians(teta)));
            double yt = (v * t * sin(Math.toRadians(teta))) - (0.5 * 9.81 * Math.pow(t, 2));
//            System.out.println(yt);
            if (h1+1 < yt && h2-1 > yt) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }
    }
}
