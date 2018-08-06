
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
public class Ptice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = {'A', 'B', 'C'};
        char[] b = {'B', 'A', 'B', 'C'};
        char[] g = {'C', 'C', 'A', 'A', 'B', 'B'};
        int ad = 0;
        int br = 0;
        int go = 0;
        int max = Integer.MIN_VALUE;
        int unused = sc.nextInt();
        String input = sc.next();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 4 == 0) {
                if (arr[i] == 'B') {
                    br++;
                }
            }
            if (i % 4 == 1) {
                if (arr[i] == 'A') {
                    br++;
                }
            }
            if (i % 4 == 2) {
                if (arr[i] == 'B') {
                    br++;
                }
            }
            if (i % 4 == 3) {
                if (arr[i] == 'C') {
                    br++;
                }
            }
            if (i % 6 == 0) {
                if (arr[i] == 'A') {
                    ad++;
                }
                if (arr[i] == 'C') {
                    go++;
                }
            }
            if (i % 6 == 1) {
                if (arr[i] == 'B') {
                    ad++;
                }
                if (arr[i] == 'C') {
                    go++;
                }
            }
            if (i % 6 == 2) {
                if (arr[i] == 'C') {
                    ad++;
                }
                if (arr[i] == 'A') {
                    go++;
                }
            }
            if (i % 6 == 3) {
                if (arr[i] == 'A') {
                    ad++;
                }
                if (arr[i] == 'A') {
                    go++;
                }
            }
            if (i % 6 == 4) {
                if (arr[i] == 'B') {
                    ad++;
                }
                if (arr[i] == 'B') {
                    go++;
                }
            }
            if (i % 6 == 5) {
                if (arr[i] == 'C') {
                    ad++;
                }
                if (arr[i] == 'B') {
                    go++;
                }
            }
        }
        if (ad > max) {
            max = ad;
        }
        if (br > max) {
            max = br;
        }
        if (go > max) {
            max = go;
        }
        System.out.println(max);
        if (ad==max) {
            System.out.println("Adrian");
        }
        if (br==max) {
            System.out.println("Bruno");
        }
        if (go==max) {
            System.out.println("Goran");
        }
    }
}
