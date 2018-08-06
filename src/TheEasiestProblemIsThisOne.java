
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class TheEasiestProblemIsThisOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        do {
            String data = in.next();
            n = Integer.parseInt(data);

            char angka[] = data.toCharArray();

            int base = 0;
            for (int i = 0; i < angka.length; i++) {
                base += Character.getNumericValue(angka[i]);
            }

            int result = 0;
            int init = 11;
            do {
                int nilai = n * init;

                String hasil = String.valueOf(nilai);
                char hitung[] = hasil.toCharArray();

                for (int i = 0; i < hitung.length; i++) {
                    result += Character.getNumericValue(hitung[i]);
                }

                if (base == result) {
                    if (n != 0) {
                        System.out.println(init);
                    }
                    break;
                } else {
                    result = 0;
                    init++;
                }
            } while (base != result);
        } while (n != 0);
    }

}
