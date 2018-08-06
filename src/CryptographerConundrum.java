
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
public class CryptographerConundrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] inp = input.toCharArray();
        int count = 0;
        for (int i = 0; i < inp.length; i++) {
            if (i % 3 == 0) {
                if (inp[i] != 'P') {
                    count++;
                }
            } else if (i % 3 == 1) {
                if (inp[i] != 'E') {
                    count++;
                }
            } else if (i % 3 == 2) {
                if (inp[i] != 'R') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
