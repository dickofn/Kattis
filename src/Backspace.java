
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
public class Backspace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] b = a.toCharArray();
        int c = 0;
        char[] temp = new char[a.length()];

        for (int i = 0; i < b.length; i++) {
            if (b[i] == '<') {
                c--;
                temp[c] = 0;
            } else {
                temp[c] = b[i];
                c++;
            }
        }

        String hasil = new String(temp);
        System.out.println(hasil.trim());
    }
}
