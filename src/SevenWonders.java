
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
public class SevenWonders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        int min = Integer.MAX_VALUE;
        int t = 0;
        int c = 0;
        int g = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'T') {
                t++;
            } else if (arr[i] == 'C') {
                c++;
            } else if (arr[i] == 'G') {
                g++;
            }
        }
        if (t < min) {
            min = t;
        }
        if (c < min) {
            min = c;
        }
        if (g < min) {
            min = g;
        }
        
        System.out.println((int)(Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2) + (7 * min)));
    }
}
