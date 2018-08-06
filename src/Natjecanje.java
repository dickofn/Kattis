
import java.util.ArrayList;
import java.util.Collections;
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
public class Natjecanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < r; i++) {
            int b = sc.nextInt();
            boolean cek = true;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == b) {
                    a.remove(j);
                    cek = false;
                    break;
                }
            }
            if (cek) {
                for (int j = 0; j < a.size(); j++) {
                    if (Math.abs(a.get(j) - b) == 1) {
                        a.remove(j);
                        break;
                    }
                }
            }

        }
        System.out.println(a.size());
    }
}
