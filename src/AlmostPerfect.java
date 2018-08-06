
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
public class AlmostPerfect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, input, sum = 1; //sum=1 biar 1 tidak dihitung lagi

        while (sc.hasNext()) {
            input = sc.nextInt();
            for (i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    sum += i;           //Hitungan ke-1
                    sum += input / i;     //Hitungan ke-2
                }
            }

            //System.out.println(sum);
            //System.out.println((int)Math.sqrt(input));
            //System.out.println(Math.sqrt(input));
            //Mencegah jika hitungan ke-1 dan ke-2 sama.
            //Karena hitungan ke 2 harusnya tidak di hitung lagi, jika yang pertama sudah menghitung akarnya.
            //Cth: input = 9, saat i=3 hitungan 1 plus 3 dan hitungan 2 plus 3;
            if ((int) Math.sqrt(input) == Math.sqrt(input)) {
                sum -= Math.sqrt(input);
            }

            //System.out.println(sum);
            if (sum == input) {
                System.out.println(input + " perfect");
            } else if (Math.abs(sum - input) <= 2) { //Guna supaya minus jadi positif [absolute]
                System.out.println(input + " almost perfect");
            } else {
                System.out.println(input + " not perfect");
            }
            sum = 1;
        }
    }
}
