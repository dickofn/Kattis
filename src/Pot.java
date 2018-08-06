
import static java.lang.Math.pow;
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
public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            int input = sc.nextInt();
            input = (int) pow((int)(input/10), input%10);
            jumlah += input;
        }
        System.out.println(jumlah);
    }
}
