
import java.util.ArrayList;
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
public class EvenUpSolitaire {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int jumlah;

        ArrayList<Integer> kartu = new ArrayList();

        jumlah = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            kartu.add(sc.nextInt());
            try {
                if (i != 0 && (kartu.get(kartu.size() - 1) + kartu.get(kartu.size() - 2)) % 2 == 0) {
                    kartu.remove(kartu.size() - 1);
                    kartu.remove(kartu.size() - 1);
                }
            } catch (Exception e) {

            }
        }
        System.out.println(kartu.size());
    }
}
