
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
public class Trik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is1 = true;
        boolean is2 = false;
        boolean is3 = false;
        String input = sc.next();
        char[] inp = input.toCharArray();
        for (int i = 0; i < inp.length; i++) {
            if (is1) {
                if (inp[i] == 'A') {
                    is1 = false;
                    is2 = true;
                }
                if (inp[i] == 'C') {
                    is1 = false;
                    is3 = true;
                }
            } else if (is2) {
                if (inp[i] == 'A') {
                    is2 = false;
                    is1 = true;
                }
                if (inp[i] == 'B') {
                    is2 = false;
                    is3 = true;
                }
            } else if (is3) {
                if (inp[i] == 'B') {
                    is3 = false;
                    is2 = true;
                }
                if (inp[i] == 'C') {
                    is3 = false;
                    is1 = true;
                }
            }
        }
        if (is1) {
            System.out.println("1");
        } else if (is2) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
