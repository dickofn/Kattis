
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
public class EngineeringEnglish {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] in = input.split("\\s+");
            for (int i = 0; i < in.length; i++) {
                if (hm.get(in[i].toLowerCase()) == null) {
                    hm.put((in[i].toLowerCase()), ".");
                    System.out.print(in[i]);
                } else {
                    System.out.print(".");
                }
                if (i!=(in.length-1)) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
