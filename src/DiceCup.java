
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
public class DiceCup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            for (int i = y+1; i <= x+1; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x+1; i <= y+1; i++) {
                System.out.println(i);
            }
        }
    }
}
