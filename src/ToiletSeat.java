
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
public class ToiletSeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int a = 0, b = 0, c = 0;
        char[] in = input.toCharArray();
        if (in[0] == 'U') {
            if (in[1] == 'U') {
                b--;
            } else {
                b++;
            }

        } else if (in[0] == 'D') {
            if (in[1] == 'D') {
                a--;
            } else {
                a++;
            }

        }
        for (int i = 1; i < in.length; i++) {
            if (in[i - 1] == 'U') {
                if (in[i] == 'U') {
                    b += 2;
                } else {
                    a += 2;
                    c++;
                }
            } else if (in[i - 1] == 'D') {
                if (in[i] == 'U') {
                    c++;
                    b += 2;
                } else {
                    a += 2;
                }
            }
        }
        System.out.println(a + "\n" + b + "\n" + c);
    }
}
