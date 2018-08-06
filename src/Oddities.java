
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
public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            int a = sc.nextInt();
            if (a%2==0) {
                System.out.println(a+" is even");
            } else {
                System.out.println(a+" is odd");
            }
        }
    }
}
