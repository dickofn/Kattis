
import java.util.HashMap;
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
public class ACMContestScoring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        int betul = 0;
        int total = 0;
        int n = sc.nextInt();
        while (n != -1) {
            String m = sc.next();
            if (hm.get(m) == null) {
                hm.put(m, 0);
            }
            String o = sc.next();

            if (o.equals("right")) {
                betul++;
                if (hm.get(m) == 0) {
                    total += n;
                } else {
                    total += n + hm.get(m) * 20;
                }
            } else {
                hm.put(m, hm.get(m) + 1);
            }
            n = sc.nextInt();
        } 
        System.out.println(betul + " " + total);

    }
}
