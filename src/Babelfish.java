
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
public class Babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        String in = sc.nextLine();
        while (!in.equals("")) {
            String[] sp = in.split("\\s+");
            hm.put(sp[1], sp[0]);
            in = sc.nextLine();
        }
        while (sc.hasNext()) {
            String test = sc.next();
            if (hm.get(test)!=null) {
                System.out.println(hm.get(test));
            } else {
                System.out.println("eh");
            }
        }
    }
}
