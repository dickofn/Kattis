
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class StringMatching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {

            String aa = sc.nextLine();
            String bb = sc.nextLine();
            int m = aa.length() - 1;
            int n = bb.length() - 1;
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < bb.length(); i++) {
                if (i <= n) {
                    try {
                        if (i != n) {

                            if (aa.charAt(0) == bb.charAt(i)) {

                                if (bb.substring(i, i + aa.length()).equals(aa)) {
                                    ls.add(i);
                                    i += aa.length();
                                }
                            }

                        }

                        if (aa.charAt(m) == bb.charAt(n)) {

                            if (bb.substring(n - m, n + 1).equals(aa)) {
                                ls.add(n - m);
                                n -= m;
                            }
                        }

                    } catch (Exception e) {
                    }
                } else {
                    break;
                }
                n--;
            }
            Collections.sort(ls);
            for (Integer l : ls) {
                System.out.print(l + " ");
            }
            System.out.println("");
        } while (sc.hasNextLine());
    }

}
