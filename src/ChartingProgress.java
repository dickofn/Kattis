
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
public class ChartingProgress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int y = 0;
            String input = sc.nextLine();
            while (!input.equals("")) {
                char[] in = input.toCharArray();

                int x = 0;

                for (int j = 0; j < in.length; j++) {
                    if (in[j] == '*') {
                        x += 1;
                    }
                }
                for (int j = 0; j < (in.length - (x + y)); j++) {
                    System.out.print(".");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                for (int j = (in.length - y); j < in.length; j++) {
                    System.out.print(".");
                }
                System.out.println();
                y += x;
                input = sc.nextLine();
            }
            System.out.println("");
        }
    }
}
