
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
public class Cetvrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        if (x1 == x2) {
            System.out.print(x3 + " ");
        } else if (x1 == x3) {
            System.out.print(x2 + " ");
        } else if (x2 == x3) {
            System.out.print(x1 + " ");
        }
        if (y1 == y2) {
            System.out.print(y3);
        } else if (y1 == y3) {
            System.out.print(y2);
        } else if (y2 == y3) {
            System.out.print(y1);
        }
    }
}
