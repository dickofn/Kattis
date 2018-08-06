
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
public class StackingCups {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] angka = new int[n];
        String[] warna = new String[n];
        for (int i = 0; i < n; i++) {
            String[] input = new String[2];
            input[0] = sc.next();
            input[1] = sc.next();

            if (isInteger(input[1])) {
                angka[i] = Integer.parseInt(input[1]);
                warna[i] = input[0];
            } else {
                angka[i] = (int) (0.5 * Integer.parseInt(input[0]));
                warna[i] = input[1];
            }
        }

        int tempangka = 0;
        String tempwarna = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (angka[j] < angka[i]) {
                    tempangka = angka[i];
                    tempwarna = warna[i];
                    angka[i] = angka[j];
                    warna[i] = warna[j];
                    angka[j] = tempangka;
                    warna[j] = tempwarna;
                }
            }
            System.out.println(warna[i]);
        }
    }
}
