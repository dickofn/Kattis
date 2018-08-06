/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dicko
 */
public class BusNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        int cek = 0;
        boolean cekk = false;
        String out = "";
        out += al.get(0);
        for (int i = 1; i < limit; i++) {
            if (al.get(i) - al.get(i - 1) == 1) {
                cek++;
                cekk = false;
            } else {
                cekk = true;
            }
            if (cek >= 2 && cekk) {
                out += "-" + al.get(i - 1);
                out += " " + al.get(i);
                cek = 0;
            } else if (cek == 1 && cekk) {
                out += " " + al.get(i - 1);
                out += " " + al.get(i);
                cek = 0;
            } else if (cek == 0) {
                out += " " + al.get(i);
            } else if (cek >= 2 && i == limit - 1 && !cekk) {
                out += "-" + al.get(i);
            } else if (cek == 1 && i == limit - 1 && !cekk) {
                out += " " + al.get(i);
            }
        }
        System.out.println(out);
    }
}
