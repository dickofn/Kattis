
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
public class ASCIIFigureRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();     
        sc.nextLine();
        do {
            int max = Integer.MIN_VALUE;
            String[] n = new String[y];
            for (int i = 0; i < y; i++) {
                n[i] = sc.nextLine();
                if (n[i].length() > max) {
                    max = n[i].length();
                }
            }
            int d = 0;
            for (int i = 0; i < max; i++) {
                String hasil = "";
                for (int j = (y - 1); j >= 0; j--) {
                    try {
                        if (n[j].charAt(d) == '-') {
                            hasil += "|";
                        } else if (n[j].charAt(d) == '|') {
                            hasil += "-";
                        } else if (n[j].charAt(d) == '+') {
                            hasil += "+";
                        } else {
                            hasil += n[j].charAt(d);
                        }
                    } catch (Exception e) {
                        hasil += " ";
                    }
                }
                System.out.print(hasil.replaceAll("\\s+$", "")); // untuk buang semua spaces di kanan yang kelebihan
                d++;
                
                System.out.println("");
            }

            y = sc.nextInt();
            sc.nextLine();
            if (y!=0) {
                System.out.println("");
            }
        } while (y != 0);

    }
}
